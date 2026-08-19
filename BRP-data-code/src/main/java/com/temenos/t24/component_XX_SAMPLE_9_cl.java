/*   |   *//************** TAFJ INFO ***************************************/
/*   |   *//* <TAFJ-BP>D:\\Temenos\\R20\\Env\\Slot02\\Products\\DesignStudio\\workspace\\BRP-data-code\\src\\Source\\XX_Sample\\Definition\\XX.Sample.component<\TAFJ-BP>  */
/*   |   *//* <TAFJ-BPA><\TAFJ-BPA>  */
/*   |   *//* <TAFJ-BN>component.XX.SAMPLE<\TAFJ-BN>  */
/*   |   *//************** TAFJ INFO ***************************************/
/*   |   */package com.temenos.t24;
/*   |   */
/*   |   */import com.temenos.tafj.common.jVar;
/*   |   */import com.temenos.tafj.common.jVarFactory;
/*   |   */import java.util.Vector;
/*   |   */import java.lang.reflect.Field;
/*   |   */import java.lang.reflect.Method;
/*   |   */import java.util.HashMap;
/*   |   */import com.temenos.api.T24TypesAbstractConvertible;
/*   |   */import com.temenos.api.ComplexTypeHelper;
/*   |   */import com.temenos.api.GenericRecordHelper;
/*   |   */import com.temenos.api.exceptions.T24CoreException;
/*   |   */import com.temenos.api.exceptions.T24IllegalArgumentException;
/*   |   */import com.temenos.tafj.common.exception.BasicErrors;
/*   |   */import com.temenos.tafj.common.exception.SessionExpirationException;
/*   |   */import com.temenos.tafj.core.nativecomponents.TF_Core;
/*   |   */import com.temenos.tafj.core.nativecomponents.TF_ErrorHandling;
/*   |   */import com.temenos.tafj.common.PreciseDecimal;
/*   |   */import com.temenos.tafj.common.jSession;
/*   |   */import com.temenos.tafj.common.constants.ConstantsSystem;
/*   |   */import com.temenos.tafj.common.util.BasicConvert;
/*   |   */import com.temenos.tafj.runtime.jRunTime;
/*   |   */import com.temenos.tafj.runtime.jAtVariable;
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
/*   |   */ //COMPONENTDEF component_XX_SAMPLE_9_cl
/*   |   */@SuppressWarnings("unused")
/*   |   */public class component_XX_SAMPLE_9_cl extends jRunTime {
/*   |   */    private final jSession session;
/*   |   */    private T24Context t24Context; // Used to populate list. Lasy initialisation
/*   |   */    private final TF_Core TF_Core;
/*   |   */    private final TF_ErrorHandling TF_ErrorHandling;
/*   |   */    
/*   |   */    public component_XX_SAMPLE_9_cl(jSession session) { // constructor
/*   |   */        this.session = session;
/*   |   */        super.init(session);
/*   |   */        this.TF_Core = new TF_Core(this);
/*   |   */        this.TF_ErrorHandling = new TF_ErrorHandling(this);
/*   |   */    }
/*   |   */    public component_XX_SAMPLE_9_cl() { // empty constructor for introspection
/*   |   */        this.session = null;
/*   |   */        this.TF_Core = null;
/*   |   */        this.TF_ErrorHandling = null;
/*   |   */    }
/*   |   */    //END 
/*   |   */    
/*   |   */    
/*   |   */    public jVar XXPasspo() {
/*   |   */          if (jRunTime.logComponentUsageEnabled(session)){
/*   |   */               jRunTime.logComponentUsage(this.session, "XX.SAMPLE", "METHOD", "XXPasspo", "XX.PASSPO");
/*   |   */          }
/*   |   */          if (this.session.isUnitTest()) {
/*   |   */              return this.session.findStub("XX.SAMPLE.XXPasspo", "XX.PASSPO").invoke();
/*   |   */          } else {
/*   |   */              jRunTime jrt = XX_PASSPO_cl.INSTANCE(this.session);
/*   |   */              jVar ret = jrt.invoke();
/*   |   */    	       return ret;
/*   |   */          }
/*   |   */    }
/*   |   */    
/*   |   */    public static jVar XXPasspo_isImplemented(){
/*   |   */       try{
/*   |   */            Class<?> jBCClass = Class.forName("com.temenos.t24.XX_PASSPO_cl");
/*   |   */            return jVarFactory.get("1" + sFM + "XX.PASSPO");
/*   |   */        }catch(Throwable t){
/*   |   */            // Stay quite 
/*   |   */        }
/*   |   */        return jVarFactory.get("0" + sFM + "XX.PASSPO");
/*   |   */    }
/*   |   */    
/*   |   */    public jVar XXVFtValidation() {
/*   |   */          if (jRunTime.logComponentUsageEnabled(session)){
/*   |   */               jRunTime.logComponentUsage(this.session, "XX.SAMPLE", "METHOD", "XXVFtValidation", "XX.V.FT.VALIDATION");
/*   |   */          }
/*   |   */          if (this.session.isUnitTest()) {
/*   |   */              return this.session.findStub("XX.SAMPLE.XXVFtValidation", "XX.V.FT.VALIDATION").invoke();
/*   |   */          } else {
/*   |   */              jRunTime jrt = XX_V_FT_VALIDATION_cl.INSTANCE(this.session);
/*   |   */              jVar ret = jrt.invoke();
/*   |   */    	       return ret;
/*   |   */          }
/*   |   */    }
/*   |   */    
/*   |   */    public static jVar XXVFtValidation_isImplemented(){
/*   |   */       try{
/*   |   */            Class<?> jBCClass = Class.forName("com.temenos.t24.XX_V_FT_VALIDATION_cl");
/*   |   */            return jVarFactory.get("1" + sFM + "XX.V.FT.VALIDATION");
/*   |   */        }catch(Throwable t){
/*   |   */            // Stay quite 
/*   |   */        }
/*   |   */        return jVarFactory.get("0" + sFM + "XX.V.FT.VALIDATION");
/*   |   */    }
/*   |   */    
/*   |   */    //
/*   |   */    // static method to get the @APIClass from a component.
/*   |   */    //  @see TF.Core.instanceof() method
/*   |   */    // 
/*   |   */    public static String getPublishedAPIClass(){
/*   |   */    	return "N/A";
/*   |   */    }
/*   |   */    //
/*   |   */    // static map & method to verify if a method is an instance of an interface
/*   |   */    //  @see TF.Core.instanceof() method
/*   |   */    // 
/*   |   */    private static HashMap<String, String> hmMethodsInterface = new HashMap<String, String>();
/*   |   */    private static HashSet<String> hsPublishedInterfaces = new HashSet<String>();
/*   |   */    static{
/*   |   */    }
/*   |   */    public static boolean isPublishedInterface(String sInterface) {
/*   |   */        return hsPublishedInterfaces.contains(sInterface);
/*   |   */    }
/*   |   */    
/*   |   */    
/*   |   */     // Only for the public interfaces. To verify if a Method is an instance of a jBC interface
/*   |   */    
/*   |   */    public static int instanceOf(String sMethod, String sInterface) {
/*   |   */        DefaultLogger.debug("instanceOf('" + sMethod + "', '" + sInterface + "')");
/*   |   */        for (String sKey : hmMethodsInterface.keySet()) {
/*   |   */            DefaultLogger.debug("hmMethodsInterface : '" + sKey + "' -> '" + hmMethodsInterface.get(sKey) + "'");
/*   |   */        }
/*   |   */        String sInstance = hmMethodsInterface.get(sMethod);
/*   |   */        DefaultLogger.debug("sInstance : '" + sInstance + "'");
/*   |   */        if (sInstance == null || !sInstance.equals(sInterface)) {
/*   |   */            DefaultLogger.debug("return 0");
/*   |   */            return 0;
/*   |   */        } else {
/*   |   */            DefaultLogger.debug("return 1");
/*   |   */            return 1;
/*   |   */        }
/*   |   */    }
/*   |   */    
/*   |   */    public jVar CallAt(Object subroutine, Object... params) {
/*   |   */        String sSubroutine = jVarFactory.get(subroutine).toString();
/*   |   */        try {
/*   |   */            Method met = component_XX_SAMPLE_9_cl.class.getDeclaredMethod(sSubroutine, new Class[] {Object.class });
/*   |   */            Object[] args = new Object[params.length];
/*   |   */            for (int i = 0; i < params.length; i++) {
/*   |   */                args[i] = params[i];
/*   |   */            }
/*   |   */            Object ret = met.invoke(this, args);
/*   |   */            return (jVar) ret;
/*   |   */        } catch (Throwable t) {
/*   |   */            super.logError("Invocation error", t);
/*   |   */            // put the exception message in a specific common for errorHandling for T24 to handle it
/*   |   */            if (this.session != null){
/*   |   */                TF_ErrorHandling.throwException(t, false);
/*   |   */            }
/*   |   */        }
/*   |   */        return null;
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
/*   |   */        String ret[] = new String[2];
/*   |   */        ret[0] = "XX.PASSPO";
/*   |   */        ret[1] = "XX.V.FT.VALIDATION";
/*   |   */        return ret;
/*   |   */    }
/*   |   */    
/*   |   */    //For Debugger and tShow
/*   |   */    public String getPathFileNameBasic(){
/*   |   */        return "D:\\Temenos\\R20\\Env\\Slot02\\Products\\DesignStudio\\workspace\\BRP-data-code\\src\\Source\\XX_Sample\\Definition\\XX.Sample.component";
/*   |   */    }
/*   |   */    
/*   |   */    //static method
/*   |   */    public static String getPathFileNameBasicStatic(){
/*   |   */        return "D:\\Temenos\\R20\\Env\\Slot02\\Products\\DesignStudio\\workspace\\BRP-data-code\\src\\Source\\XX_Sample\\Definition\\XX.Sample.component";
/*   |   */    }
/*   |   */    
/*   |   */    //For tShow
/*   |   */    public String getCompileInfo() {
/*   |   */        return "1787119813357	19 Aug 2026 11:40:13	LTTTF40	3";
/*   |   */    }
/*   |   */    
/*   |   */    // static method
/*   |   */    public static String getCompileInfoStatic() {
/*   |   */        return "1787119813357	19 Aug 2026 11:40:13	LTTTF40	3";
/*   |   */    }
/*   |   */    
/*   |   */    //For tShow
/*   |   */    public String getPackageBasic() {
/*   |   */        return "";
/*   |   */    }
/*   |   */    
/*   |   */    // No need to instanciate the class to get it
/*   |   */    public static String getPackageBasicStatic() {
/*   |   */        return "";
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
/*   |   */    public static String getServiceDefinition() {
/*   |   */        return "eNpLzs8tyM9LzStRiIjQC3b0DfBx5cpNLUnMzU9JzQlLLSrOzM9TMNQz4+IqKE3KyUxWAEpm5KcAVQckFhcX5CtocGlyVXMpKChkOTlbgQwJcAwODvDnqsXUEeZWEpaYk5mSWAIyFENjmJ5biF6Yo4+ni2OIp78f0AQAknsv0Q==";
/*   |   */    }
/*   |   */
/*   |   */}

