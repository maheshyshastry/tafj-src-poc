/*   |   *//*  @ValidationCode : MjoyMDgyNDU0NTg4OkNwMTI1MjoxNTE3MDU1ODA4NzM5OnBtYW5pdGhhOi0xOi0xOjA6MDpmYWxzZTpOL0E6REVWXzIwMTcxMS40Oi0xOi0x */
/*   |   *//*  @ValidationInfo : Timestamp         : 27 Jan 2018 17:53:28 */
/*   |   *//*  @ValidationInfo : Encoding          : Cp1252 */
/*   |   *//*  @ValidationInfo : User Name         : pmanitha */
/*   |   *//*  @ValidationInfo : Nb tests success  : N/A */
/*   |   *//*  @ValidationInfo : Nb tests failure  : N/A */
/*   |   *//*  @ValidationInfo : Rating            : N/A */
/*   |   *//*  @ValidationInfo : Coverage          : N/A */
/*   |   *//*  @ValidationInfo : Strict flag       : N/A */
/*   |   *//*  @ValidationInfo : Bypass GateKeeper : false */
/*   |   *//*  @ValidationInfo : Compiler Version  : DEV_201711.4 */
/*   |   *//*  */
/*   |   *//*  Implementation of XX.SAMPLE.XxPasspo */
/*   |   *//*  */
/*   |   *//*  */
/*   |   *//************** TAFJ INFO ***************************************/
/*   |   *//* <TAFJ-BP>D:\\Temenos\\R20\\Env\\Slot02\\Products\\DesignStudio\\workspace\\BRP-data-code\\src\\Source\\XX_Sample\\Source\\Private\\XX.PASSPO.b<\TAFJ-BP>  */
/*   |   *//* <TAFJ-BPA>XX.SAMPLE<\TAFJ-BPA>  */
/*   |   *//* <TAFJ-BN>XX.PASSPO<\TAFJ-BN>  */
/*   |   *//************** TAFJ INFO ***************************************/
/*   |   */package com.temenos.t24;
/*   |   */
/*   |   */import com.temenos.tafj.common.jVar;
/*   |   */import com.temenos.tafj.common.jVarFactory;
/*   |   */import com.temenos.tafj.common.jVarConstFactory;
/*   |   */import com.temenos.tafj.common.PreciseDecimal;
/*   |   */import com.temenos.tafj.common.jSession;
/*   |   */import com.temenos.tafj.common.Environment;
/*   |   */import com.temenos.tafj.common.BasicRuntimeException;
/*   |   */import com.temenos.tafj.common.exception.JBCCatchableException;
/*   |   */import com.temenos.tafj.common.exception.NeedRestartException;
/*   |   */import com.temenos.tafj.common.jPosition;
/*   |   */import com.temenos.tafj.common.Constants;
/*   |   */import com.temenos.tafj.runtime.jRunTime;
/*   |   */import com.temenos.tafj.runtime.jAtVariable;
/*   |   */import java.lang.reflect.Field;
/*   |   */import com.temenos.tafj.common.jSystem;
/*   |   */import com.temenos.t24.*;
/*   |   */import com.temenos.tafj.api.client.impl.T24Context;
/*   |   */import com.temenos.tafj.api.client.impl.TAFJRuntimeFactory;
/*   |   */import com.temenos.api.T24TypesConvertibleHelper;
/*   |   */import com.temenos.api.ListHelper;
/*   |   */import java.util.ArrayList;
/*   |   */import java.util.List;
/*   |   */import java.util.HashSet;
/*   |   */import com.temenos.api.TString;
/*   |   */import com.temenos.api.TNumber;
/*   |   */import com.temenos.api.TDate;
/*   |   */import com.temenos.api.TBoolean;
/*   |   */import com.temenos.api.TStructure;
/*   |   */import com.temenos.api.TValidationResponse;
/*   |   */import com.temenos.tafj.common.IntAndKey;
/*   |   */import com.temenos.tafj.common.DefaultLogger;
/*   |   */
/*   |   */ //SUBROUTINE XX_PASSPO_cl
/*   |   */@SuppressWarnings("unused")
/*   |   */public class XX_PASSPO_cl extends jRunTime {
/*   |   */    public component_ST_Customer_16_cl ST_Customer = null;
/*   |   */    public component_EB_SystemTables_19_cl EB_SystemTables = null;
/*   |   */    public component_XX_SAMPLE_9_cl XX_SAMPLE = null;
/*   |   */    // Empty Constructor
/*   |   */    public XX_PASSPO_cl(){
/*   |   */    }
/*   |   */    
/*   |   */    // Loop when program needs to pause (debug)
/*   |   */    private boolean _inMove_ = false;
/*   |   */    
/*   |   */    // used for common variable re-initisation
/*   |   */    private boolean _commonWasNull = false;
/*   |   */    
/*   |   */    @Override
/*   |   */    public void keepMoving(){
/*   |   */    	this._inMove_ = true;
/*   |   */    	while(this._inMove_){
/*   |   */    		move();
/*   |   */    	}
/*   |   */    }
/*   |   */    public void move(){
/*   |   */    	try {
/*   |   */    		Thread.sleep(200);
/*   |   */    	} catch (InterruptedException e) {
/*   |   */    	}
/*   |   */    }
/*   |   */    @Override
/*   |   */    public void stopMoving(){
/*   |   */    	this._inMove_ = false;
/*   |   */    }
/*   |   */    
/*   |   */    protected int main(){
/*    22 */        /* ----------------------------------------------------------------------------- */
_l(    23);        if (boolVal(op_equal(getEB_SystemTables().getMessage(), "VAL")))
/*   |   */        {
_l(    24);            set(_legalId, getEB_SystemTables().getRNew(getST_Customer()._Customer_EbCusLegalId));
_l(    25);            if (boolVal(_legalId))
/*   |   */            {
_l(    26);                if (boolVal(op_ne(fGet(_legalId, 1, 3),"123")))
/*   |   */                {
_l(    27);                    getEB_SystemTables().setEtext(op_cat("INVALID LEGAL ID : \"",_legalId).concat("\""));
_l(    28);                    getEB_SystemTables().setMessage("ERROR");
/*   |   */                }
_l(    29);                 //ENDIF
/*   |   */            }
_l(    30);             //ENDIF
/*   |   */        }
_l(    31);         //ENDIF
_l(    33,257);        _Sys_ReturnTo = LABEL_NULL;   //RETURN
/*   |   */        if (true) return LABEL_NULL;  //RETURN
/*    35 */        /* ----------------------------------------------------------------------------- */
/*   |   */        //END 
/*   |   */        return LABEL_STOP;                            //END
/*   |   */    }
/*   |   */    
/*   |   */    public jVar invoke(Object ... args) {
/*   |   */        if (args.length != 0 ) {
/*   |   */            throw new RuntimeException("Wrong number of arguments : XX.PASSPO has 0 arguments ");
/*   |   */        }
/*   |   */        while(true){
/*   |   */            try{
/*   |   */                return invoke();
/*   |   */            }catch(NeedRestartException nrt){
/*   |   */                invokeRestart("XX_PASSPO_cl",false,  new jVar[]{});
/*   |   */                super.setNeedRestart(false);
/*   |   */                create();  // recreate all the variables.
/*   |   */            }
/*   |   */        }
/*   |   */    }
/*   |   */    
/*   |   */    
/*   |   */    
/*   |   */    private boolean _isBreak_        = false; //flag if a break append in a loop
/*   |   */    private boolean _isContinue_     = false; //flag if a continue append in a loop
/*   |   */    private boolean _loop_          = true;  //need it for the LOOP statement
/*   |   */    private boolean _NeedInitialise_ = true;  //To know whether we have to initialize the common and vars or not
/*   |   */    private String[] _varList_       = null; //List of the variables in this program
/*   |   */    private String[] _componentList_       = null; //List of the component in this program
/*   |   */    private static String[] _paramList_     = null; //List of the parameter of this program
/*   |   */    
/*   |   */    
/*   |   */    public static jRunTime INSTANCE(jSession session) {
/*   |   */        jRunTime prg = null;
/*   |   */        prg =session.getRuntimeCache("XX_PASSPO_cl");
/*   |   */        if (prg == null) {
/*   |   */            prg = new XX_PASSPO_cl();
/*   |   */            prg.init(session);
/*   |   */        }
/*   |   */        return prg;
/*   |   */    }
/*   |   */    
/*   |   */    public void stack(XX_PASSPO_cl prg){
/*   |   */        if (session.setRuntimeCache("XX_PASSPO_cl", prg)){
/*   |   */            //
/*   |   */            // No need to initialise the common and the vars.
/*   |   */            //
/*   |   */            this._NeedInitialise_ = false;
/*   |   */        }
/*   |   */    }
/*   |   */    
/*   |   */    public jVar invoke() {
/*   |   */        int nStoredPrecision = session.getPrecision();
/*   |   */        invokeStart("XX_PASSPO_cl",false,  new jVar[]{});
/*   |   */        JBCCatchableException _jbce = null;
/*   |   */        int nRet = 0;
/*   |   */        try {
/*   |   */             nRet = main();
/*   |   */        } catch (JBCCatchableException jbce) {
/*   |   */            try {
/*   |   */                if (lbl_CATCH__ERROR() == Integer.MIN_VALUE) {
/*   |   */                    // let's leave normally and throw the exception afterwards
/*   |   */                    _jbce = jbce;
/*   |   */                }
/*   |   */            } catch (JBCCatchableException jbce2) {
/*   |   */                // In the CATCH_ERROR, the exception has been thrown again.
/*   |   */                _jbce = jbce2;
/*   |   */            }
/*   |   */        }
/*   |   */        if (nRet > 0){
/*   |   */            CB(nRet);
/*   |   */        }else{
/*   |   */            check(nRet);
/*   |   */        }
/*   |   */        release();
/*   |   */        invokeStop("XX_PASSPO_cl",false,  new jVar[]{});
/*   |   */        session.setPrecision(nStoredPrecision);
/*   |   */        stack(this);
/*   |   */        if (_jbce != null) {
/*   |   */            throw _jbce;
/*   |   */        }
/*   |   */        return _Sys_RetRoutine;
/*   |   */    }
/*   |   */    
/*   |   */    // Invoked whenever the debugger needs to know the BASIC source file name.
/*   |   */    public String getBASICName(){
/*   |   */        return "XX.PASSPO";
/*   |   */    }
/*   |   */    
/*   |   */    // Invoked whenever the debugger needs to know the BASIC source file name.
/*   |   */    public static String getBASICNameStatic(){
/*   |   */        return "XX.PASSPO";
/*   |   */    }
/*   |   */    
/*   |   */    // Used by jRuntime when invoking the CodeCoverage.
/*   |   */    public int getNbLines(){
/*   |   */        return 10;
/*   |   */    }
/*   |   */    
/*   |   */    // Static metod used by the CodeCoverage when initializing all the classes
/*   |   */    public static int getNbLinesStatic(){
/*   |   */        return 10;
/*   |   */    }
/*   |   */    
/*   |   */    // Invoked whenever the debugger needs to know what variables are in this program.
/*   |   */    public String[] getVarList(){
/*   |   */       if (_varList_ == null){
/*   |   */          //Initialize the list
/*   |   */          _varList_ = new String[1];
/*   |   */          _varList_[0] = "legalId(jVar)";
/*   |   */       }
/*   |   */       return _varList_;
/*   |   */    }
/*   |   */    
/*   |   */    // Invoked whenever the debugger needs to get a Var Contents.
/*   |   */    public String getVarValue(String sVarName){
/*   |   */       int nPos = sVarName.lastIndexOf("(");
/*   |   */       String sType = "jVar"; // default.
/*   |   */       if (nPos > 0){
/*   |   */           sType = sVarName.substring(nPos + 1, sVarName.length()-1);
/*   |   */           sVarName = sVarName.substring(0,nPos);
/*   |   */       }
/*   |   */       sVarName = jSystem.convertNameVar(sVarName);
/*   |   */       try {
/*   |   */           @SuppressWarnings("rawtypes")
/*   |   */           Class c = this.getClass();
/*   |   */           Field fVar = null;
/*   |   */           try{
/*   |   */               fVar = c.getDeclaredField(sVarName);
/*   |   */               sType = fVar.getType().getName();
/*   |   */           }catch(NoSuchFieldException e){
/*   |   */               // In case we have a version with def class
/*   |   */               c = this.getClass().getSuperclass();
/*   |   */               fVar = c.getDeclaredField(sVarName);
/*   |   */               sType = fVar.getType().getName();
/*   |   */           }
/*   |   */       if (sType.equals("long")){
/*   |   */           long jv = (Long)fVar.get(this);
/*   |   */           return String.valueOf(jv); 
/*   |   */       }else if (sType.equals("String")){
/*   |   */           String jv = (String)fVar.get(this);
/*   |   */           return jv;           
/*   |   */       }else if (sType.equals("unknow")){
/*   |   */          try{
/*   |   */               jVar jv = (jVar)fVar.get(this);
/*   |   */               return jv.toExternalString();
/*   |   */          }catch(Exception e){
/*   |   */    	   }
/*   |   */          try{
/*   |   */               String jv = (String)fVar.get(this);
/*   |   */               return jv;   
/*   |   */    	   }catch(Exception e){
/*   |   */          }
/*   |   */    	   try{
/*   |   */    		  long jv = (Long)fVar.get(this);
/*   |   */             return String.valueOf(jv); 
/*   |   */    	   }catch(Exception e){
/*   |   */          }
/*   |   */          return "N/A";
/*   |   */       }else{
/*   |   */          jVar jv = (jVar)fVar.get(this);
/*   |   */          return jv.toExternalString();
/*   |   */       }
/*   |   */       } catch (Exception e) {
/*   |   */          return "N/A";
/*   |   */       }
/*   |   */    }
/*   |   */    
/*   |   */    
/*   |   */    // Invoked whenever the debugger needs to set a Var Contents.
/*   |   */    public String setVarValue(String sVarName, String sValue) {
/*   |   */       int nPos = sVarName.lastIndexOf("(");
/*   |   */       String sType = "jVar"; // default.
/*   |   */       if (nPos > 0){
/*   |   */           sType = sVarName.substring(nPos + 1, sVarName.length()-1);
/*   |   */           sVarName = sVarName.substring(0,nPos);
/*   |   */       }
/*   |   */    	sVarName = jSystem.convertNameVar(sVarName);
/*   |   */     try {
/*   |   */           @SuppressWarnings("rawtypes")
/*   |   */           Class c = this.getClass();
/*   |   */           Field fVar = null;
/*   |   */           try{
/*   |   */               fVar = c.getDeclaredField(sVarName);
/*   |   */           }catch(NoSuchFieldException e){
/*   |   */               // In case we have a version with def class
/*   |   */               c = this.getClass().getSuperclass();
/*   |   */               fVar = c.getDeclaredField(sVarName);
/*   |   */           }
/*   |   */    		if (sType.equals("long")) {
/*   |   */    			fVar.setLong(this, Long.parseLong(sValue));
/*   |   */    			return sValue;
/*   |   */    		} else if (sType.equals("String")) {
/*   |   */    			fVar.set(this, sValue);
/*   |   */    			return sValue;
/*   |   */    		} else {
/*   |   */    			jVar jv = (jVar) fVar.get(this);
/*   |   */    			jv.set(sValue);
/*   |   */    			return sValue;
/*   |   */    		}
/*   |   */    	} catch (Exception e) {
/*   |   */    		return "! Failure !";
/*   |   */    	}
/*   |   */    }
/*   |   */    
/*   |   */    //Variables
/*   |   */    public jVar _legalId;
/*   |   */    
/*   |   */    // init method.
/*   |   */    public void init(jSession _s_ ) {
/*   |   */        super.init(_s_);
/*   |   */        
/*   |   */        if (_NeedInitialise_){
/*   |   */            create();
/*   |   */        }else{
/*   |   */            reset();
/*   |   */        }
/*   |   */    }
/*   |   */    
/*   |   */        public component_ST_Customer_16_cl getST_Customer(){ 
/*   |   */          if (ST_Customer != null){
/*   |   */        	  return ST_Customer;
/*   |   */        	  }
/*   |   */            ST_Customer = (component_ST_Customer_16_cl)this.getSession().getComponentCache("ST.Customer");
/*   |   */            if (ST_Customer== null) {
/*   |   */                 ST_Customer= this.getSession().putComponentInCache("ST.Customer", new component_ST_Customer_16_cl(this.getSession()));
/*   |   */            }
/*   |   */            return ST_Customer;
/*   |   */        }
/*   |   */        public component_EB_SystemTables_19_cl getEB_SystemTables(){ 
/*   |   */          if (EB_SystemTables != null){
/*   |   */        	  return EB_SystemTables;
/*   |   */        	  }
/*   |   */            EB_SystemTables = (component_EB_SystemTables_19_cl)this.getSession().getComponentCache("EB.SystemTables");
/*   |   */            if (EB_SystemTables== null) {
/*   |   */                 EB_SystemTables= this.getSession().putComponentInCache("EB.SystemTables", new component_EB_SystemTables_19_cl(this.getSession()));
/*   |   */            }
/*   |   */            return EB_SystemTables;
/*   |   */        }
/*   |   */        public component_XX_SAMPLE_9_cl getXX_SAMPLE(){ 
/*   |   */          if (XX_SAMPLE != null){
/*   |   */        	  return XX_SAMPLE;
/*   |   */        	  }
/*   |   */            XX_SAMPLE = (component_XX_SAMPLE_9_cl)this.getSession().getComponentCache("XX.SAMPLE");
/*   |   */            if (XX_SAMPLE== null) {
/*   |   */                 XX_SAMPLE= this.getSession().putComponentInCache("XX.SAMPLE", new component_XX_SAMPLE_9_cl(this.getSession()));
/*   |   */            }
/*   |   */            return XX_SAMPLE;
/*   |   */        }
/*   |   */    public String[] getComponentList(){ 
/*   |   */       if (_componentList_ == null){
/*   |   */          //Initialize the list
/*   |   */          _componentList_ = new String[4];
/*   |   */          _componentList_[0] = "ST.Customer";
/*   |   */          _componentList_[1] = "EB.SystemTables";
/*   |   */          _componentList_[2] = "XX.SAMPLE";
/*   |   */       }
/*   |   */       return _componentList_;
/*   |   */    }
/*   |   */    
/*   |   */    // create method.
/*   |   */    public void create() {
/*   |   */        _legalId = jVarFactory.get();
/*   |   */    }
/*   |   */    
/*   |   */    // reset method.
/*   |   */    public void reset() {
/*   |   */        _legalId.reset();
/*   |   */    }
/*   |   */    
/*   |   */    public void CLEAR() {
/*   |   */        _file0001.CLEAR();
/*   |   */        _legalId.CLEAR();
/*   |   */    }
/*   |   */    
/*   |   */    public void release() {
/*   |   */        //UNMAT
/*   |   */        
/*   |   */        //RELEASE
/*   |   */        _legalId.release();
/*   |   */    }
/*   |   */    
/*   |   */    //Gosub
/*   |   */    protected void GOSUB(int nLabel) {
/*   |   */        GOSUB(nLabel, true);
/*   |   */    }
/*   |   */    
/*   |   */    protected void GOSUB(int nLabel, boolean checkCallStack) {
/*   |   */        int nRet = LABEL_NULL;
/*   |   */        if (checkCallStack){
/*   |   */            try{
/*   |   */                checkCallStack("-gs:" + getLabelName(nLabel));
/*   |   */            }catch(Exception e){
/*   |   */                session.setStateSubroutine(STATE_EXIT);
/*   |   */                nLabel = LABEL_EXIT;
/*   |   */                nRet = LABEL_EXIT;
/*   |   */            }
/*   |   */        }
/*   |   */        switch(nLabel){
/*   |   */        case main:
/*   |   */            nRet = main();
/*   |   */            break;
/*   |   */        default:
/*   |   */        }
/*   |   */        check(nRet);
/*   |   */    }
/*   |   */    
/*   |   */    //CB
/*   |   */    protected void CB(int sNext) {
/*   |   */        GOSUB(sNext, false);
/*   |   */    }
/*   |   */    
/*   |   */    //Flags
/*   |   */    
/*   |   */    //Labels
/*   |   */    protected final static int LABEL_EXIT = -3;
/*   |   */    protected final static int LABEL_STOP = -2;
/*   |   */    protected final static int LABEL_NULL = -1;
/*   |   */    protected final static int main = 0;
/*   |   */    
/*   |   */    //Only for callstack comparison
/*   |   */    private String getLabelName(int nLabel){
/*   |   */        return "";
/*   |   */    }
/*   |   */    
/*   |   */    // Invoked whenever the unitTest Framework needs to know what variables are in this program.
/*   |   */    public String[] getParamList(){
/*   |   */       if (_paramList_ == null){
/*   |   */          //Initialize the list
/*   |   */          _paramList_ = new String[0];
/*   |   */       }
/*   |   */       return _paramList_;
/*   |   */    }
/*   |   */    public jVar[] getParams(){
/*   |   */        return new jVar[]{
/*   |   */    
/*   |   */       };
/*   |   */    }
/*   |   */    
/*   |   */    // Invoked whenever the unitTest Framework needs to know what variables are in this program.
/*   |   */    public static String[] getParamListStatic(){
/*   |   */       if (_paramList_ == null){
/*   |   */          //Initialize the list
/*   |   */          _paramList_ = new String[0];
/*   |   */       }
/*   |   */       return _paramList_;
/*   |   */    }
/*   |   */    
/*   |   */            public jVar getDataStructureNames() {
/*   |   */            StringBuilder sb = new StringBuilder();
/*   |   */            boolean first = true;
/*   |   */            for (Field f : this.getClass().getFields()) {
/*   |   */                if (f.getName().startsWith("_h__i__d__d__e__n__fields_")) {
/*   |   */                    if (!first) {
/*   |   */                        sb.append(sFM);
/*   |   */                    }
/*   |   */                    first = false;
/*   |   */                    sb.append(f.getName().substring("_h__i__d__d__e__n__fields_".length()).replace('_', '.'));
/*   |   */                }
/*   |   */            }
/*   |   */            return jVarFactory.get(sb.toString());
/*   |   */    
/*   |   */        }
/*   |   */    
/*   |   */        public jVar getDataStructureFields(Object jvClassName) {
/*   |   */            String className = jvClassName.toString();
/*   |   */            StringBuilder sb = new StringBuilder();
/*   |   */            try {
/*   |   */                Field f = this.getClass().getField("_h__i__d__d__e__n__fields_" + className.replace('.', '_'));
/*   |   */                if (f != null) {
/*   |   */                    String[] fields = (String[]) f.get(null);
/*   |   */                    boolean first = true;
/*   |   */                    for (String oneField : fields) {
/*   |   */                        if (!first) {
/*   |   */                            sb.append(sFM);
/*   |   */                        }
/*   |   */                        first = false;
/*   |   */                        sb.append(oneField);
/*   |   */                    }
/*   |   */                }
/*   |   */            } catch (Exception e) {
/*   |   */            }
/*   |   */            return jVarFactory.get(sb.toString());
/*   |   */    
/*   |   */        }
/*   |   */    
/*   |   */    //For Sanity Check
/*   |   */    public static String[] getDependenciesStatic(){
/*   |   */        String ret[] = new String[0];
/*   |   */        return ret;
/*   |   */    }
/*   |   */    
/*   |   */    //For Debugger and tShow
/*   |   */    public String getPathFileNameBasic(){
/*   |   */        return "D:\\Temenos\\R20\\Env\\Slot02\\Products\\DesignStudio\\workspace\\BRP-data-code\\src\\Source\\XX_Sample\\Source\\Private\\XX.PASSPO.b";
/*   |   */    }
/*   |   */    
/*   |   */    //static method
/*   |   */    public static String getPathFileNameBasicStatic(){
/*   |   */        return "D:\\Temenos\\R20\\Env\\Slot02\\Products\\DesignStudio\\workspace\\BRP-data-code\\src\\Source\\XX_Sample\\Source\\Private\\XX.PASSPO.b";
/*   |   */    }
/*   |   */    
/*   |   */    //For tShow
/*   |   */    public String getCompileInfo() {
/*   |   */        return "1787119830049	19 Aug 2026 11:40:30	LTTTF40	3";
/*   |   */    }
/*   |   */    
/*   |   */    // static method
/*   |   */    public static String getCompileInfoStatic() {
/*   |   */        return "1787119830049	19 Aug 2026 11:40:30	LTTTF40	3";
/*   |   */    }
/*   |   */    
/*   |   */    //For tShow
/*   |   */    public String getPackageBasic() {
/*   |   */        return "XX.SAMPLE";
/*   |   */    }
/*   |   */    
/*   |   */    // No need to instanciate the class to get it
/*   |   */    public static String getPackageBasicStatic() {
/*   |   */        return "XX.SAMPLE";
/*   |   */    }
/*   |   */    
/*   |   */    //For tShow
/*   |   */    public String getImportBasic() {
/*   |   */        return "com.temenos.t24";
/*   |   */    }
/*   |   */    
/*   |   */    // No need to instanciate the class to get it
/*   |   */    public static String getImportBasicStatic() {
/*   |   */        return "com.temenos.t24";
/*   |   */    }
/*   |   */    
/*   |   */    //For tShow
/*   |   */    public String getVersion() {
/*   |   */        return "R21_AMR.0";
/*   |   */    }
/*   |   */    
/*   |   */    // No need to instanciate the class to get it
/*   |   */    public static String getVersionStatic() {
/*   |   */        return "R21_AMR.0";
/*   |   */    }
/*   |   */    
/*   |   */    //For tShow
/*   |   */    public String getReplacementInfo() {
/*   |   */        return "false";
/*   |   */    }
/*   |   */
/*   |   */}

