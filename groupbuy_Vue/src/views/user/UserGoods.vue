<template>
    <div id="app">
        <el-table :data="tableData" border style="width: 100%" :fit="true">
            <el-table-column prop="goodsImg" label="图片">
                <template #default="scope">
                    <el-image :fit="fit" style="width:80px;height:80px" :src="scope.row.goodsImg"></el-image>
                </template>
            </el-table-column>
            <el-table-column prop="storeName" label="店名">
            </el-table-column>
            <el-table-column prop="goodsName" label="名称">
            </el-table-column>
            <el-table-column prop="goodsPrice" label="价格">
            </el-table-column>
            <el-table-column prop="goodsUnit" label="单位">
            </el-table-column>
            <el-table-column fixed="right" label="操作">
                <template #default="scope">
                    <el-button @click="addGoodsToCart(scope.row)" type="text" size="small">添加入购物车</el-button>
                    <el-button @click="openGoodsEvaluate(scope.row)" type="text" size="small">查看评价</el-button>
                </template>
            </el-table-column>
        </el-table>

        <el-pagination @size-change="handleSizeChange" @current-change="handleCurrentChange" :current-page="currentPage"
            :page-sizes="[5, 10, 20]" :page-size="5" layout="total, sizes, prev, pager, next, jumper" :total="total"
            :page-count="pageCount">
        </el-pagination>


        <el-drawer title="商品评价" v-model="visible.goodsEvalute" size="30%">
            <el-card>
                <el-table :data="table.goodsEvalute" height="700" border style="width: 100%" :fit="true">
                    <el-table-column label="评分" width="150px">
                        <template #default="scope">
                            <el-rate disabled v-model="scope.row.level"></el-rate>
                        </template>
                    </el-table-column>
                    <el-table-column prop="userNote" label="用户评价">
                    </el-table-column>
                    <el-table-column prop="createTime" label="评价时间">
                    </el-table-column>
                </el-table>
            </el-card>
        </el-drawer>
    </div>
</template>

<script>

    export default {
        data() {
            return {
                total: null,
                tableData: null,
                pageCount: null,
                currentPage: null,
                pageNo: 1,
                pageSize: 5,

                visible: {
                    goodsEvalute: false,
                },
                table: {
                    goodsEvalute: null,
                },

                fit: 'fill',
            }
        },
        methods: {
            addGoodsToCart(row) {
                this.postRequest("/user/cart/" + row.id).then((resp) => {
                    if (resp.success) {
                        this.getTableData(this.pageNo, this.pageSize);
                    }
                });
            },
            openGoodsEvaluate(row) {
                this.getRequest("/user/goods/evaluate/" + row.id).then((resp) => {
                    if (resp.success) {
                        this.table.goodsEvalute = resp.data;
                        this.visible.goodsEvalute = true;
                    }
                });
            },
            handleSizeChange(pageSize) {
                this.pageSize = pageSize;
                this.getTableData(this.pageNo, this.pageSize)
            },
            handleCurrentChange(pageNo) {
                this.pageNo = pageNo;
                this.getTableData(this.pageNo, this.pageSize)
            },
            getTableData(pageNo, pageSize) {

                this.getRequest("/user/goods/all/" + pageNo + "/" + pageSize).then((resp) => {
                    this.tableData = resp.records;
                    this.tableData.forEach(element => {
                        element.goodsImg = '/file/image?filePath=' + encodeURI(element.goodsImg);
                    })
                    this.total = resp.total;
                    this.pageCount = resp.pages;
                });
            },
        },
        created() {
            this.select = true;
            this.getTableData(this.pageNo, this.pageSize);
        },

    }
</script>
<style>
    .header {
        margin-bottom: 5px;
    }
</style>