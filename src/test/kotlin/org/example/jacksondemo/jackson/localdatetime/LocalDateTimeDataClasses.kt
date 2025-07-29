package org.example.jacksondemo.jackson.localdatetime


import java.time.LocalDateTime
import com.fasterxml.jackson.annotation.JsonProperty
import org.example.jacksondemo.jackson.ExpectedJson
import java.time.LocalDate

@ExpectedJson("""{"issueDate":"2000-01-01T00:00:00"}""")
data class TestLocalDateTimeField1(val issueDate: LocalDateTime = LocalDateTime.parse("2000-01-01T00:00:00"))

@ExpectedJson("""{"issue_date":"2000-01-01T00:00:00"}""")
data class TestLocalDateTimeField2(val issue_date: LocalDateTime = LocalDateTime.parse("2000-01-01T00:00:00"))

@ExpectedJson("""{"getIssueDate":"2000-01-01T00:00:00"}""")
data class TestLocalDateTimeField3(val getIssueDate: LocalDateTime = LocalDateTime.parse("2000-01-01T00:00:00"))

@ExpectedJson("""{"setIssueDate":"2000-01-01T00:00:00"}""")
data class TestLocalDateTimeField4(val setIssueDate: LocalDateTime = LocalDateTime.parse("2000-01-01T00:00:00"))

@ExpectedJson("""{"isIssueDate":"2000-01-01T00:00:00"}""")
data class TestLocalDateTimeField5(val isIssueDate: LocalDateTime = LocalDateTime.parse("2000-01-01T00:00:00"))

@ExpectedJson("""{"issuedate":"2000-01-01T00:00:00"}""")
data class TestLocalDateTimeField6(val ISSUEDATE: LocalDateTime = LocalDateTime.parse("2000-01-01T00:00:00"))

@ExpectedJson("""{"issuedate":"2000-01-01T00:00:00"}""")
data class TestLocalDateTimeField7(val issuedate: LocalDateTime = LocalDateTime.parse("2000-01-01T00:00:00"))

@ExpectedJson("""{"issueDate1":"2000-01-01T00:00:00"}""")
data class TestLocalDateTimeField8(val issueDate1: LocalDateTime = LocalDateTime.parse("2000-01-01T00:00:00"))

@ExpectedJson("""{"issue_date_2":"2000-01-01T00:00:00"}""")
data class TestLocalDateTimeField9(val issue_date_2: LocalDateTime = LocalDateTime.parse("2000-01-01T00:00:00"))

@ExpectedJson("""{"_issueDate":"2000-01-01T00:00:00"}""")
data class TestLocalDateTimeField10(val _issueDate: LocalDateTime = LocalDateTime.parse("2000-01-01T00:00:00"))

@ExpectedJson("""{"issueDate_":"2000-01-01T00:00:00"}""")
data class TestLocalDateTimeField11(val issueDate_: LocalDateTime = LocalDateTime.parse("2000-01-01T00:00:00"))

@ExpectedJson("""{"createdAt":"2000-01-01T00:00:00"}""")
data class TestLocalDateTimeField12(val createdAt: LocalDateTime = LocalDateTime.parse("2000-01-01T00:00:00"))

@ExpectedJson("""{"updated_at":"2000-01-01T00:00:00"}""")
data class TestLocalDateTimeField13(val updated_at: LocalDateTime = LocalDateTime.parse("2000-01-01T00:00:00"))

@ExpectedJson("""{"getSetIssueDate":"2000-01-01T00:00:00"}""")
data class TestLocalDateTimeField14(val getSetIssueDate: LocalDateTime = LocalDateTime.parse("2000-01-01T00:00:00"))

@ExpectedJson("""{"setGetIssueDate":"2000-01-01T00:00:00"}""")
data class TestLocalDateTimeField15(val setGetIssueDate: LocalDateTime = LocalDateTime.parse("2000-01-01T00:00:00"))

@ExpectedJson("""{"isGetIssueDate":"2000-01-01T00:00:00"}""")
data class TestLocalDateTimeField16(val isGetIssueDate: LocalDateTime = LocalDateTime.parse("2000-01-01T00:00:00"))

@ExpectedJson("""{"get_is_issue_date":"2000-01-01T00:00:00"}""")
data class TestLocalDateTimeField17(val get_is_issue_date: LocalDateTime = LocalDateTime.parse("2000-01-01T00:00:00"))

@ExpectedJson("""{"issueDateTime":"2000-01-01T00:00:00"}""")
data class TestLocalDateTimeField18(val issueDateTime: LocalDateTime = LocalDateTime.parse("2000-01-01T00:00:00"))

@ExpectedJson("""{"dateTimeIssued":"2000-01-01T00:00:00"}""")
data class TestLocalDateTimeField19(val dateTimeIssued: LocalDateTime = LocalDateTime.parse("2000-01-01T00:00:00"))

@ExpectedJson("""{"issueDateNullable":null}""")
data class TestLocalDateTimeField20(val issueDateNullable: LocalDateTime? = null)

@ExpectedJson("""{"is_issue_date":null}""")
data class TestLocalDateTimeField21(val is_issue_date: LocalDateTime? = null)

@ExpectedJson("""{"get_issue_date":null}""")
data class TestLocalDateTimeField22(val get_issue_date: LocalDateTime? = null)

@ExpectedJson("""{"class":null}""")
data class TestLocalDateTimeField23(@field:JsonProperty("class") val class_: LocalDateTime? = null)

@ExpectedJson("""{"object":"2000-01-01T00:00:00"}""")
data class TestLocalDateTimeField24(@field:JsonProperty("object") val object_: LocalDateTime = LocalDateTime.parse("2000-01-01T00:00:00"))

@ExpectedJson("""{"null":null}""")
data class TestLocalDateTimeField25(@field:JsonProperty("null") val null_: LocalDateTime? = null)

@ExpectedJson("""{"date":"2000-01-01T00:00:00"}""")
data class TestLocalDateTimeField26(val date: LocalDateTime = LocalDateTime.parse("2000-01-01T00:00:00"))

@ExpectedJson("""{"timestamp":null}""")
data class TestLocalDateTimeField27(val timestamp: LocalDateTime? = null)

// ==== LocalDate ====
@ExpectedJson("""{"issueDate":"2000-01-01"}""")
data class TestLocalDateField1(val issueDate: LocalDate = LocalDate.parse("2000-01-01"))

@ExpectedJson("""{"issue_date":"2000-01-01"}""")
data class TestLocalDateField2(val issue_date: LocalDate = LocalDate.parse("2000-01-01"))

@ExpectedJson("""{"getIssueDate":"2000-01-01"}""")
data class TestLocalDateField3(val getIssueDate: LocalDate = LocalDate.parse("2000-01-01"))

@ExpectedJson("""{"setIssueDate":"2000-01-01"}""")
data class TestLocalDateField4(val setIssueDate: LocalDate = LocalDate.parse("2000-01-01"))

@ExpectedJson("""{"isIssueDate":"2000-01-01"}""")
data class TestLocalDateField5(val isIssueDate: LocalDate = LocalDate.parse("2000-01-01"))

@ExpectedJson("""{"issuedate":"2000-01-01"}""")
data class TestLocalDateField6(val ISSUEDATE: LocalDate = LocalDate.parse("2000-01-01"))

@ExpectedJson("""{"issuedate":"2000-01-01"}""")
data class TestLocalDateField7(val issuedate: LocalDate = LocalDate.parse("2000-01-01"))

@ExpectedJson("""{"issueDate1":"2000-01-01"}""")
data class TestLocalDateField8(val issueDate1: LocalDate = LocalDate.parse("2000-01-01"))

@ExpectedJson("""{"issue_date_2":"2000-01-01"}""")
data class TestLocalDateField9(val issue_date_2: LocalDate = LocalDate.parse("2000-01-01"))

@ExpectedJson("""{"_issueDate":"2000-01-01"}""")
data class TestLocalDateField10(val _issueDate: LocalDate = LocalDate.parse("2000-01-01"))

@ExpectedJson("""{"issueDate_":"2000-01-01"}""")
data class TestLocalDateField11(val issueDate_: LocalDate = LocalDate.parse("2000-01-01"))

@ExpectedJson("""{"createdAt":"2000-01-01"}""")
data class TestLocalDateField12(val createdAt: LocalDate = LocalDate.parse("2000-01-01"))

@ExpectedJson("""{"updated_at":"2000-01-01"}""")
data class TestLocalDateField13(val updated_at: LocalDate = LocalDate.parse("2000-01-01"))

@ExpectedJson("""{"getSetIssueDate":"2000-01-01"}""")
data class TestLocalDateField14(val getSetIssueDate: LocalDate = LocalDate.parse("2000-01-01"))

@ExpectedJson("""{"setGetIssueDate":"2000-01-01"}""")
data class TestLocalDateField15(val setGetIssueDate: LocalDate = LocalDate.parse("2000-01-01"))

@ExpectedJson("""{"isGetIssueDate":"2000-01-01"}""")
data class TestLocalDateField16(val isGetIssueDate: LocalDate = LocalDate.parse("2000-01-01"))

@ExpectedJson("""{"get_is_issue_date":"2000-01-01"}""")
data class TestLocalDateField17(val get_is_issue_date: LocalDate = LocalDate.parse("2000-01-01"))

@ExpectedJson("""{"issueDateTime":"2000-01-01"}""")
data class TestLocalDateField18(val issueDateTime: LocalDate = LocalDate.parse("2000-01-01"))

@ExpectedJson("""{"dateTimeIssued":"2000-01-01"}""")
data class TestLocalDateField19(val dateTimeIssued: LocalDate = LocalDate.parse("2000-01-01"))

@ExpectedJson("""{"issueDateNullable":null}""")
data class TestLocalDateField20(val issueDateNullable: LocalDate? = null)

@ExpectedJson("""{"is_issue_date":null}""")
data class TestLocalDateField21(val is_issue_date: LocalDate? = null)

@ExpectedJson("""{"get_issue_date":null}""")
data class TestLocalDateField22(val get_issue_date: LocalDate? = null)

@ExpectedJson("""{"class":null}""")
data class TestLocalDateField23(@field:JsonProperty("class") val class_: LocalDate? = null)

@ExpectedJson("""{"object":"2000-01-01"}""")
data class TestLocalDateField24(@field:JsonProperty("object") val object_: LocalDate = LocalDate.parse("2000-01-01"))

@ExpectedJson("""{"null":null}""")
data class TestLocalDateField25(@field:JsonProperty("null") val null_: LocalDate? = null)

@ExpectedJson("""{"date":"2000-01-01"}""")
data class TestLocalDateField26(val date: LocalDate = LocalDate.parse("2000-01-01"))

@ExpectedJson("""{"timestamp":null}""")
data class TestLocalDateField27(val timestamp: LocalDate? = null)
