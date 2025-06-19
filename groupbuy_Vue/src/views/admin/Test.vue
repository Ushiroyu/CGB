<template>
  <div>
    <table>
      <thead>
        <tr>
          <th>ID</th>
          <th>NAME</th>
          <th>AGE</th>
        </tr>
      </thead>
      <tbody>
        <tr v-for="item in users" :key="item.id">
          <td>{{ item.id }}</td>
          <td>{{ item.name }}</td>
          <td>{{ item.age }}</td>
        </tr>
      </tbody>
    </table>
    {{ msg }}
    <el-button type="primary" @click="tests">刷新数据</el-button>
  </div>
</template>

<script>
import axios from 'axios';

export default {
  name: "Test",
  data() {
    return {
      msg: 'hello',
      users: []
    }
  },
  created() {
    this.loadData();
  },
  methods: {
    loadData() {
      axios.get("http://localhost:8888/tests")
        .then(resp => {
          this.users = resp.data.records;
        })
        .catch(console.error);
    },
    tests() {
      this.loadData(); // 复用已有方法
    }
  }
}
</script>

<style scoped>
table {
  width: 100%;
  border-collapse: collapse;
}
th, td {
  border: 1px solid #ddd;
  padding: 8px;
  text-align: left;
}
th {
  background-color: #f2f2f2;
}
</style>