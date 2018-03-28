package voctrals.json;

import com.alibaba.fastjson.JSON;

public class DaughterJsonTest {


    public static void main(String[] args) {
        System.out.println(JSON.toJSONString(new String("Hello World")));

        // ^>^ 不考虑功能性
        // 不能使用兄弟项目依赖的jar包
        // ExcelNumberFormat excelNumberFormat = new ExcelNumberFormat(1, "");
    }

}
