<%@ page import="calendar.Post" %>



<div class="fieldcontain ${hasErrors(bean: postInstance, field: 'creationDate', 'error')} required">
	<label for="creationDate">
		<g:message code="post.creationDate.label" default="Creation Date" />
		<span class="required-indicator">*</span>
	</label>
	<g:datePicker name="creationDate" precision="day"  value="${postInstance?.creationDate}"  />
</div>

<div class="fieldcontain ${hasErrors(bean: postInstance, field: 'postDate', 'error')} required">
	<label for="postDate">
		<g:message code="post.postDate.label" default="Post Date" />
		<span class="required-indicator">*</span>
	</label>
	<g:datePicker name="postDate" precision="day"  value="${postInstance?.postDate}"  />
</div>

<div class="fieldcontain ${hasErrors(bean: postInstance, field: 'title', 'error')} ">
	<label for="title">
		<g:message code="post.title.label" default="Title" />
		
	</label>
	<g:textField name="title" value="${postInstance?.title}"/>
</div>

