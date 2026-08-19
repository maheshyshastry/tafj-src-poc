* @ValidationCode : Mjo1ODExMjIwNzY6Q3AxMjUyOjE1MTcwNTU4NTYxNTA6cG1hbml0aGE6LTE6LTE6MDowOmZhbHNlOk4vQTpERVZfMjAxNzExLjQ6LTE6LTE=
* @ValidationInfo : Timestamp         : 27 Jan 2018 17:54:16
* @ValidationInfo : Encoding          : Cp1252
* @ValidationInfo : User Name         : pmanitha
* @ValidationInfo : Nb tests success  : N/A
* @ValidationInfo : Nb tests failure  : N/A
* @ValidationInfo : Rating            : N/A
* @ValidationInfo : Coverage          : N/A
* @ValidationInfo : Strict flag       : N/A
* @ValidationInfo : Bypass GateKeeper : false
* @ValidationInfo : Compiler Version  : DEV_201711.4
$PACKAGE XX.SAMPLE
*
* Implementation of XX.SAMPLE1.XxVFtValidation
*
*
SUBROUTINE XX.V.FT.VALIDATION
    $USING EB.SystemTables
    $USING ST.Customer
    
    creditAmount = EB.SystemTables.getRNew(ST.Customer.Customer.EbCusLegalId)
    IF creditAmount > 500 THEN
        EB.SystemTables.setE('Amount greater than 500 (DS packager demo)')
    END

RETURN
