<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- <meta name="viewport" content="width=device-width,initial-scale=1"> -->
<title><tiles:getAsString name = "title"/></title>
<link href="/css/admin/layout.css" type="text/css" rel="stylesheet" />
<style>
    
    #visual .content-container{	
        height:inherit;
        display:flex; 
        align-items: center;
        
        background: url("/images/mypage/visual.png") no-repeat center;
    }
</style>
</head>
<body>
	<!-- header 부분 -->
<tiles:insertAttribute name = "header"/>
	<!-- --------------------------- <body> --------------------------------------- -->
	<tiles:insertAttribute name = "body"/>
	<!-- ------------------- <footer> --------------------------------------- -->
	<tiles:insertAttribute name = "footer"/>
</body>
</html>