import ElementPlus from 'element-plus'
import 'element-plus/dist/index.css'
import zhCn from 'element-plus/dist/locale/zh-cn.mjs' // 确保路径正确

export default (app) => {
  app.use(ElementPlus, {
    locale: zhCn // 正确定义locale变量
  })
}
