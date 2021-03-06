<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<%@ page import="java.util.List,br.com.alura.gerenciador_5.servlet.Empresa" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<c:url value="/removeEmpresa" var="removeEmpresa" />
<c:url value="/mostraEmpresa" var="mostraEmpresa"></c:url>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<c:if test="${not empty empresa}">
	
		Empresa ${ empresa } cadastrada com sucesso!
	
	</c:if>

	
	Lista de Empresas: <br />
	<ul>
	
		<c:forEach items="${empresas}" var = "empresa">
			
			
		
			<li> 
				${empresa.nome } - <fmt:formatDate value="${empresa.dataAbertura}" pattern="dd/MM/yyyy"/> 
				
				<a href="${ mostraEmpresa }?id=${ empresa.id }"> editar </a>
				<a href="${removeEmpresa}?id=${ empresa.id }"> remover </a>
			
			</li>
		
		</c:forEach>
	
	
	</ul>

</body>
</html>