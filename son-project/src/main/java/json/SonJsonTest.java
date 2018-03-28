package json;

import com.alibaba.fastjson.JSON;
import org.apache.poi.ss.usermodel.ExcelNumberFormat;

public class SonJsonTest {

    public static void main(String[] args) {
        // 可以使用parent-project中的json
        System.out.println(JSON.toJSONString(new String("Hello World")));

        // ^>^ 不考虑功能性
        // 使用单独依赖的jar包
        ExcelNumberFormat excelNumberFormat = new ExcelNumberFormat(1, "");

    }

}
