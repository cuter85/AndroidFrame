package viewholder;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by cuter85 on 2016/7/5.
 * Copyright Chance 2011-2015 All Rights Reserved
 */
public abstract class CommonViewHolder<T> extends RecyclerView.ViewHolder
{

    public CommonViewHolder(Context context, ViewGroup root, int layoutRes)
    {
        super(LayoutInflater.from(context).inflate(layoutRes, root, false));
    }

    public Context getContext()
    {
        return itemView.getContext();
    }

    /**
     * 用给定的 data 对 holder 的 view 进行赋值
     */
    public abstract void bindData(T t);

    public void setData(T t)
    {
        bindData(t);
    }

    /**
     * 因为 CommonListAdapter 里边无法对于未知类型的 Class 进行实例化
     * 所以需要如果想用 CommonListAdapter，必须要在对应的 CommonViewHolder 实例化一个 HOLDER_CREATOR
     * 注意：public static ViewHolderCreator HOLDER_CREATOR，名字与修饰符都不能更改，否则有可能引发失败
     * 具体样例可参见 DiscoverItemHolder
     * 如果不使用 CommonListAdapter，则不需要实例化 ViewHolderCreator
     * @param <VH>
     */
    public interface ViewHolderCreator<VH extends CommonViewHolder>
    {
        public VH createByViewGroupAndType(ViewGroup parent, int viewType);
    }
}
