<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<%@ include file="../header.jsp" %>
<body>
<div class="page-contents">
    <form id="updateForm" name="updateForm" method="post">
        <div>
            <h2>글쓰기</h2>
            <div>
                <table>
                
                    <tr>
                        <th>카테고리</th>                       
                        <td>
                            <select id="category_id" name="category_id">
                                <option value="3">게시판</option>
                                <option value="4">헬스 영상</option>
                                <option value="6">문의 게시판</option>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <th>제목</th>
                        <td><input style="width: 500px" type="text" id="title" name="title" value="${result.title}"/></td>
                    </tr>
                    <tr>
                        <th>내용</th>
                        <td><textarea style="width: 500px" rows="10" cols="10" id="content" name="content">${result.content}</textarea></td>
                    </tr>
                    <tr>
                        <th>작성자</th>
                        <td><input style="width: 500px" type="text" id="user_id" name="user_id" value="${result.user_id}" /></td>
                    </tr>
                    
                </table>
                <div>
                    <a href='#' onClick='fn_updatetoPost()'>수정</a>
                    <a href='#' onClick='fn_cancel()'>취소</a>
                </div>
            </div>
        </div>
        <input type='hidden' id='id' name='id' value='${result.id}' />
    </form>
<script>
//글쓰기
function fn_updatetoPost(){

	
    var form = document.getElementById("updateForm");
    
    form.action = "<c:url value='/board/update.do'/>";
    form.submit();
    
}

//취소
function fn_cancel(){
	location.href = document.referrer;
}




</script>
</div>
</body>


<%@ include file="../footer.jsp" %>  