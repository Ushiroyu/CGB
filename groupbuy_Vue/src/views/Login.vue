<template>
    <div>
        <el-form :rules="rules" ref="loginForm" v-loading="loading" element-loading-text="正在登录..."
            element-loading-spinner="el-icon-loading" element-loading-background="rgba(0, 0, 0, 0.8)" :model="loginForm"
            class="loginContainer">
            <h3 class="loginTitle">系统登录</h3>
            <el-form-item prop="username">
                <el-input size="medium" type="text" v-model="loginForm.username" auto-complete="off"
                    placeholder="请输入用户名"></el-input>
            </el-form-item>
            <el-form-item prop="password">
                <el-input size="medium" type="password" v-model="loginForm.password" auto-complete="off"
                    placeholder="请输入密码"></el-input>
            </el-form-item>
            <el-form-item prop="code">
                <el-input size="medium" type="text" v-model="loginForm.code" auto-complete="off" placeholder="点击图片更换验证码"
                    @keydown.enter.native="submitLogin" style="width: 250px"></el-input>
                <img :src="vcUrl" @click="updateVerifyCode" alt="" style="cursor: pointer">
            </el-form-item>
            <el-checkbox size="medium" class="loginRemember" v-model="loginForm.rememberMe">记住我</el-checkbox>
            <el-button size="small" style="float: right;" round @click="toRegister">注册</el-button>
            <el-button size="medium" type="primary" style="width: 100%;" @click="submitLogin">登录</el-button>
        </el-form>
    </div>
</template>

<script>

    export default {
        name: "Login",
        data() {
            return {
                loading: false,
                vcUrl: '/verifyCode?time=' + new Date(),
                loginForm: {
                    username: 'admin',
                    password: '123456',
                    code: '1',
                    rememberMe: false,
                },
                checked: true,
                rules: {
                    username: [{ required: true, message: '请输入用户名', trigger: 'blur' }],
                    password: [{ required: true, message: '请输入密码', trigger: 'blur' }],
                    code: [{ required: true, message: '请输入验证码', trigger: 'blur' }]
                }
            }
        },
        methods: {
            updateVerifyCode() {
                this.vcUrl = '/verifyCode?time=' + new Date();
            },
            submitLogin() {
                this.$refs.loginForm.validate((valid) => {
                    if (valid) {
                        this.loading = true;
                        this.postRequest('/doLogin', this.loginForm).then(resp => {
                            this.loading = false;
                            if (resp) {
                                this.$store.commit('INIT_CURRENTUSER', resp.data);
                                window.sessionStorage.setItem("user", JSON.stringify(resp.data));
                                let path = this.$route.query.redirect;
                                this.$router.replace((path == '/' || path == undefined) ? '/index' : path);
                            } else {
                                this.vcUrl = '/verifyCode?time=' + new Date();
                            }
                        })
                    } else {
                        return false;
                    }
                });
            },
            checkLogin() {
                this.getRequest('/checkLogin').then((resp) => {
                    console.log(resp);
                    if (resp.success) {
                        this.$store.commit('INIT_CURRENTUSER', resp.data);
                        window.sessionStorage.setItem("user", JSON.stringify(resp.data));
                        let path = this.$route.query.redirect;
                        this.$router.replace((path == '/' || path == undefined) ? '/index' : path);
                    }
                })
            },
            toRegister() {
                this.$router.push('register');
            }
        },
        created() {
            this.checkLogin();
        }
    }
</script>

<style>
    .loginContainer {
        border-radius: 15px;
        background-clip: padding-box;
        margin: 180px auto;
        width: 350px;
        padding: 15px 35px 15px 35px;
        background: #fff;
        border: 1px solid #eaeaea;
        box-shadow: 0 0 25px #cac6c6;
    }

    .loginTitle {
        margin: 15px auto 20px auto;
        text-align: center;
        color: #505458;
    }

    .loginRemember {
        text-align: left;
        margin: 0px 0px 15px 0px;
    }

    .el-form-item__content {
        display: flex;
        align-items: center;
    }
</style>