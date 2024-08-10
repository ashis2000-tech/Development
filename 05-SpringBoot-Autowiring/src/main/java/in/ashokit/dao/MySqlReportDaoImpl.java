package in.ashokit.dao;

import org.springframework.stereotype.Repository;

@Repository("mysql")
public class MySqlReportDaoImpl implements ReportDao {

	public MySqlReportDaoImpl() {
		System.out.println("MySqlReportDaoImpl::constructor");
	}
@Override
public String findData() {
	System.out.println("fetching report data from mysql db....");
	return "Report data";
} 
}
