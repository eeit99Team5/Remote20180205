package model;

import java.util.List;

public interface ItemsDAO {

	ItemsBean select(Integer giftNum);

	List<ItemsBean> select();

	boolean insert(ItemsBean bean);

	boolean update(Integer giftNum, String giveId, java.util.Date giveTime, String getId, Integer giftCount,
			Integer price);

	boolean delete(Integer giftNum);

}