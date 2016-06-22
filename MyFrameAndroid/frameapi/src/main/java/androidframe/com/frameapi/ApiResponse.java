package androidframe.com.frameapi;

/**
 * Created by cuter85 on 2016/6/21.
 * Copyright Chance 2011-2015 All Rights Reserved
 */
public class ApiResponse<T>
{
    private String event;       // 返回码，0为成功
    private String msg;         // 返回信息
    private T      obj;         // 单个对象
    private T      objList;     // 数组对象
    private int    currentPage; // 当前页数
    private int    pageSize;    // 每页显示数量
    private int    maxCount;    // 总条数
    private int    maxPage;     // 总页数

    public ApiResponse(String event, String msg)
    {
        this.event = event;
        this.msg = msg;
    }

    public boolean isSuccess()
    {
        return event.equals("0");
    }
}
