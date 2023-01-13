<?xml version="1.0" encoding="iso-8859-1"?>
<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/request">
        <xsl:variable name="name" select="//name"/>
        <xsl:message select="foo"/>
        <response>
            <message>
                <xsl:value-of select="concat('Hello, ', $name)"/>
            </message>
        </response>
    </xsl:template>
</xsl:stylesheet>