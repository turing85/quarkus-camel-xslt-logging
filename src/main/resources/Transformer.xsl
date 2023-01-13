<?xml version="1.0" encoding="iso-8859-1"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:output method="xml" version="1.0" encoding="UTF-8"/>

    <xsl:template match="/request">
        <xsl:variable name="name" select="//name/text()"/>
        <xsl:message select = "'Creating response for name = ', $name"/>
        <response>
            <message>
                <xsl:value-of select="concat('Hello, ', $name)"/>
            </message>
        </response>
    </xsl:template>
</xsl:stylesheet>