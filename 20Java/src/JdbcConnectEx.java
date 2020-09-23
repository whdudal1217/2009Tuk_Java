import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;

public class JdbcConnectEx {
	public static void main(String[] args) {

		// 1. 드라이버 검색
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 검색 실패");
		}

		// 2. Connection 객체 생성
		Connection conn = null;
		String url = "jdbc:mysql://localhost:3306/jdbc_ex?serverTimezone=UTC&useSSL=false&characterEncoding=UTF-8&useUnicode=true&allowPublicKeyRetrieval=true";
		String user = "root";
		String pass = "0_0MI1217";

		// 3. query문 담고 query 실행 담을 것
		String query = ""; // 쿼리 수행

		Statement stmt = null;
		PreparedStatement pstmt = null; // 쿼리 수행, 바인딩 변수 사용
		ResultSet rs = null; // 쿼리 수행 결과 저장

		try {
			conn = DriverManager.getConnection(url, user, pass);
			System.out.println("시스템 연결 성공");
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

			System.out.print("id : ");
			String id = reader.readLine();
			System.out.print("pwd : ");
			String pwd = reader.readLine();
			System.out.print("name");
			String name = reader.readLine();
			System.out.print("phone : ");
			String phone = reader.readLine();
			System.out.print("email :");
			String email = reader.readLine();

			query = "INSERT INTO tb_member ( MEM_ID, MEM_PWD, MEM_NAME, MEM_PHONE, MEM_EMAIL) " + "VALUES (?,?,?,?,?)";

			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, id);
			pstmt.setString(2, pwd);
			pstmt.setString(3, name);
			pstmt.setString(4, phone);
			pstmt.setString(5, email);

			int updCnt = pstmt.executeUpdate(); // insert, delete, update

			System.out.println(updCnt + "행이 등록되었습니다");

			query = "SELECT MEM_SEQ_NO, MEM_ID, MEM_PWD, MEM_NAME, MEM_PHONE, MEM_EMAIL FROM tb_member ORDER BY MEM_SEQ_NO DESC";

			stmt = conn.createStatement();

			rs = stmt.executeQuery(query);// select 하나의 행을 다 가져옴
			while (rs.next()) {
				int memSeqNo = rs.getInt("MEM_SEQ_NO"); // rs.getInt(1) 순서로도 가져올 수 있고 컬럼명으로도 가져올 수 있음
				String memId = rs.getString("MEM_ID");
				String memPwd = rs.getString("MEM_PWD");
				String memName = rs.getString("MEM_NAME");
				String memPhone = rs.getString("MEM_PHONE");
				String memEmail = rs.getString("MEM_EMAIL");

				System.out.printf(" seqNo : %d id : %s pwd : %s  name : %s  phone :  %s  email : %s \n ", 
						memSeqNo, memId, memPwd, memName, memPhone, memEmail);
			}

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("시스템 연결 실패");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
/*
 * MEM_SEQ_NO int NOT NULL AUTO_INCREMENT, MEM_ID varchar(45) COLLATE utf8_bin
 * DEFAULT NULL, MEM_PWD varchar(45) COLLATE utf8_bin DEFAULT NULL, MEM_NAME
 * varchar(45) COLLATE utf8_bin DEFAULT NULL, MEM_PHONE varchar(45) COLLATE
 * utf8_bin DEFAULT NULL, MEM_EMAIL varchar(45) COLLATE utf8_bin DEFAULT NULL,
 */