package edu.ict.prj.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import edu.ict.prj.vo.EmpVO;

public class EmpDao {

	private DataSource dataSource = null; //커넥션풀 객체

	public EmpDao() {
		try {

			Context context = new InitialContext();
			dataSource = (DataSource)context.lookup("java:comp/env/jdbc/oracle");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List<EmpVO> empSelect() {

		List<EmpVO> vos = new ArrayList<>();

		Connection connection = null;
		Statement statement = null;
		ResultSet rs = null;

		String sql = "select * from emp";

		try {
			connection = dataSource.getConnection();
			statement = connection.createStatement();
			rs = statement.executeQuery(sql);

			while (rs.next()) {
				int empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				String job = rs.getString("job");
				int mgr = rs.getInt("mgr");
				Date hiredate = rs.getDate("hiredate");
				int sal = rs.getInt("sal");
				String comm = rs.getString("comm");
				int deptno = rs.getInt("deptno");
				
				EmpVO vo = new EmpVO(empno, ename, job, mgr, hiredate, sal, comm, deptno);

				vos.add(vo);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				if (rs != null)
					rs.close();

				if (statement != null)
					statement.close();

				if (connection != null)
					connection.close();
			} catch (Exception e) {
			}

		}

		return vos;

	}
	
	
	//내가 추가
	public EmpVO empSelectOne(int empno2) {

		EmpVO vo = null;

		Connection connection = null;
		Statement statement = null;
		ResultSet rs = null;

		String sql = "select * from emp where empno = " + empno2;

		try {
			connection = dataSource.getConnection();
			statement = connection.createStatement();
			rs = statement.executeQuery(sql);

			//한명이기때문에 while 을 if로 줘도된다
			while (rs.next()) {
				int empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				String job = rs.getString("job");
				int mgr = rs.getInt("mgr");
				Date hiredate = rs.getDate("hiredate");
				int sal = rs.getInt("sal");
				String comm = rs.getString("comm");
				int deptno = rs.getInt("deptno");
				
				vo = new EmpVO(empno, ename, job, mgr, hiredate, sal, comm, deptno);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				if (rs != null)
					rs.close();

				if (statement != null)
					statement.close();

				if (connection != null)
					connection.close();
			} catch (Exception e) {
			}

		}

		return vo;

	}
}
