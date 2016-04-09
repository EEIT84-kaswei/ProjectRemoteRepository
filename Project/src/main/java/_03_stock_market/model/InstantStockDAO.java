package _03_stock_market.model;
/*張秀維 Hsiu Chang, 01-04-2016 */

import java.math.BigDecimal;
import java.util.List;

import org.hibernate.Session;

public interface InstantStockDAO {

	Session getSession();

	InstantStockBean select(Integer stock_Code,java.sql.Timestamp iDatetime);

	List<InstantStockBean> select();
	InstantStockBean insert(InstantStockBean bean);

	InstantStockBean update(String stock_TypeCode, Integer stock_Code,java.sql.Timestamp iDatetime,String stock_Name,
			BigDecimal purchase_Price,BigDecimal selling_Price,BigDecimal final_price,
			BigDecimal change_Amount,BigDecimal change_extent,Integer acc_Trade_Volume);

	boolean delete(Integer stock_Code,java.sql.Timestamp iDatetime);

}