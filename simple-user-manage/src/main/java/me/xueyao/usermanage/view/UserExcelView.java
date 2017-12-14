package me.xueyao.usermanage.view;

import me.xueyao.usermanage.pojo.User;
import me.xueyao.usermanage.utils.Constants;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.joda.time.DateTime;
import org.springframework.web.servlet.view.document.AbstractExcelView;
import org.springframework.web.servlet.view.document.AbstractXlsView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

import static me.xueyao.usermanage.utils.Constants.*;

/**
 * @author XueYao
 * @date 2017-12-13
 */
public class UserExcelView extends AbstractXlsView {

    @Override
    protected void buildExcelDocument(Map<String, Object> model, Workbook workbook, HttpServletRequest request, HttpServletResponse response) throws Exception {
        List<User> userList = (List<User>) model.get("userList");

        Sheet sheet = workbook.createSheet("会员列表");

        Row header = sheet.createRow(0);
        header.createCell(0).setCellValue("ID");
        header.createCell(1).setCellValue("用户名");
        header.createCell(2).setCellValue("姓名");
        header.createCell(3).setCellValue("年龄");
        header.createCell(4).setCellValue("性别");
        header.createCell(5).setCellValue("出生日期");
        header.createCell(6).setCellValue("创建日期");
        header.createCell(7).setCellValue("更新日期");

        int rowNum = 1;
        for (User user : userList) {
            Row row = sheet.createRow(rowNum);
            row.createCell(0).setCellValue(user.getId());
            row.createCell(1).setCellValue(user.getUserName());
            row.createCell(2).setCellValue(user.getName());
            row.createCell(3).setCellValue(user.getAge());
            String sexStr;
            if (user.getSex() == 1){
                sexStr = "男";
            } else if (user.getSex() == 2) {
                sexStr = "女";
            } else {
                sexStr = "未知";
            }
            row.createCell(4).setCellValue(sexStr);
            row.createCell(5).setCellValue(new DateTime(user.getBirthday()).toString(Constants.DATE));
            row.createCell(6).setCellValue(new DateTime(user.getCreated()).toString(Constants.DATE_TIME));
            row.createCell(7).setCellValue(new DateTime(user.getUpdated()).toString(Constants.DATE_TIME));
            rowNum++;
        }
        response.setHeader("Content-Disposition", "attachment;filename=" + new String("会员列表.xls".getBytes(),"ISO-8859-1"));
    }
}
