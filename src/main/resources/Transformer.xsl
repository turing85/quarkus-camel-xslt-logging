<?xml version="1.0" encoding="iso-8859-1"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:output method="xml" version="1.0" encoding="UTF-8"/>

    <xsl:template match="/request">
        <xsl:variable name="name" select="//name/text()"/>
        <xsl:message>Creating response for name = <xsl:value-of select="$name"/></xsl:message>
        <response>
            <message>Hello, <xsl:value-of select="$name"/></message>
        </response>
    </xsl:template>
</xsl:stylesheet>