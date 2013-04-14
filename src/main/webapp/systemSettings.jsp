<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Insert title here</title>
</head>
<body>
	<fieldset>
		<legend>信息设置</legend>

		<table>
			<tr>
				<td>字数设置
				<td>
				<td><form action="systemSettings.action">
						<input type="hidden" value="perMsgWords" name="method"> <input
							type="text" name="settingsValue"> <input type="submit"
							value="提交修改" />
					</form></td>
			</tr>
			<tr>
				<td>发送次数限制设置
				<td>
				<td><form action="systemSettings.action">
						<input type="hidden" value="sendMsgNum" name="method"> <input
							type="text" name="settingsValue"> <input type="submit"
							value="提交修改" />
					</form></td>
			</tr>
			<tr>
				<td>删除已发布信息时间设置
				<td>
				<td><form action="systemSettings.action">
						<input type="hidden" value="delReleasedMsgLong" name="method">
						<input type="text" name="settingsValue"> <input
							type="submit" value="提交修改" />
					</form></td>
			</tr>
			<tr>
				<td>删除未通过信息时间设置
				<td>
				<td><form action="systemSettings.action">
						<input type="hidden" value="delUnpassedMsgLong" name="method">
						<input type="text" name="settingsValue"> <input
							type="submit" value="提交修改" />
					</form></td>
			</tr>

		</table>
	</fieldset>
</body>
</html>