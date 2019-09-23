package xyz.ruankun.sxsicau.vo.fvo;

import java.util.Date;

/**
 * 封装一个公司的信息
 */
public class CorporationVO {

    /**
     * 企查查 查询工商信息返回例子
     {
     "OrderNumber": "ECI2019061819433684318720",
     "Paging": {
     "PageSize": 2,
     "PageIndex": 1,
     "TotalRecords": 250
     },
     "Result": [
     {
     "KeyNo": "4659626b1e5e43f1bcad8c268753216e",
     "Name": "北京小桔科技有限公司",
     "OperName": "程维",
     "StartDate": "2012-07-10 00:00:00",
     "Status": "在业",
     "No": "110108015068911",
     "CreditCode": "9111010859963405XW"
     },
     {
     "KeyNo": "4178fc374c59a79743c59ecaf098d4dd",
     "Name": "深圳市小桔科技有限公司",
     "OperName": "王举",
     "StartDate": "2015-04-22 00:00:00",
     "Status": "存续",
     "No": "440301112653267",
     "CreditCode": "91440300334945450M"
     }
     ],
     "Status": "200",
     "Message": "查询成功"
     }
     */
    private String KeyNo;       //内部KeyNo
    private String Name;        //公司名称
    private String OperName;        //法人名称
    private Date StartDate;     //成立日期
    private String Status;  //企业状态
    private String No;      //注册号
    private String CreditCode;      //社会统一信用代码

    public String getKeyNo() {
        return KeyNo;
    }

    public void setKeyNo(String keyNo) {
        KeyNo = keyNo;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getOperName() {
        return OperName;
    }

    public void setOperName(String operName) {
        OperName = operName;
    }

    public Date getStartDate() {
        return StartDate;
    }

    public void setStartDate(Date startDate) {
        StartDate = startDate;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getNo() {
        return No;
    }

    public void setNo(String no) {
        No = no;
    }

    public String getCreditCode() {
        return CreditCode;
    }

    public void setCreditCode(String creditCode) {
        CreditCode = creditCode;
    }

    @Override
    public String toString() {
        return "CorporationVO{" +
                "KeyNo='" + KeyNo + '\'' +
                ", Name='" + Name + '\'' +
                ", OperName='" + OperName + '\'' +
                ", StartDate=" + StartDate +
                ", Status='" + Status + '\'' +
                ", No='" + No + '\'' +
                ", CreditCode='" + CreditCode + '\'' +
                '}';
    }
}
