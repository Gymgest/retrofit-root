package retrofit2

/**
 *@author：huangjiaheng
 *time：2023/2/10
 *desc：
 */
object CustomPlugin {

  var enableCustom = false;

  private var customCall : CustomCall ?= null


  fun registerCall(customCall: CustomCall){
    this.customCall = customCall;
  }

  fun post(factory: RequestFactory){
    customCall?.customCall(factory)
  }

  interface CustomCall{
    fun customCall(factory: RequestFactory)
  }
}
