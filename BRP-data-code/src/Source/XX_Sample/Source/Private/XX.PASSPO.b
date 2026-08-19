* @ValidationCode : MjoyMDgyNDU0NTg4OkNwMTI1MjoxNTE3MDU1ODA4NzM5OnBtYW5pdGhhOi0xOi0xOjA6MDpmYWxzZTpOL0E6REVWXzIwMTcxMS40Oi0xOi0x
* @ValidationInfo : Timestamp         : 27 Jan 2018 17:53:28
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
* Implementation of XX.SAMPLE.XxPasspo
*
*
SUBROUTINE XX.PASSPO

    $USING ST.Customer
    $USING EB.SystemTables
    
*-----------------------------------------------------------------------------
    IF EB.SystemTables.getMessage() = 'VAL' THEN
        legalId = EB.SystemTables.getRNew(ST.Customer.Customer.EbCusLegalId)
        IF legalId THEN
            IF legalId[1,3] <> '123' THEN
                EB.SystemTables.setEtext('INVALID LEGAL ID : "' : legalId : '"')
                EB.SystemTables.setMessage("ERROR")
            END
        END
    END

RETURN

*-----------------------------------------------------------------------------
END
