#### jQuery中的循环遍历:
1. 普通for循环遍历,每次获取的是数组中的值,也就是js对象
2. jquery对象的each();
    * index: 就是遍历时的索引
    * element: 当前索引对应的js对象
    * jquery对象.each(function(index,element){});
3. 使用jquery的全局方法each();可以遍历js数组
    * index: 就是遍历时的索引
    * element: 当前索引对应的数组中的值
    * $.each(array,function(index,element){
    });
    
#### jQuery事件的绑定
1. 事件绑定的第一种方式:
jQuery中事件都是通过事件方法来绑定
    * 格式: jquery对象.事件方法(fn);
    * jquery中如果给一个标签的同一个事件进行多次绑定,效果会叠加出现
2. 事件绑定的第二种方式:
通过jQuery的bind()方法
    * 格式: jquery对象.bind(事件名,fn);
    * 如果需要给标签同时绑定多个事件
    * 格式: jquery对象.bind({事件名:fn,事件名:fn})
#### jQuery事件的解绑
1. jquery对象.unbind(); 解绑所有事件.
2. jquery对象.unbind(事件名); 解绑指定的事件

#### 事件切换(了解)
* hover(fn1, fn2);
    * fn1:鼠标悬浮事件的响应行为
    * fn2:鼠标移出事件的响应行为
* toggle(fn1,fn2...); 事件的切换
    * fn1:第一次点击时执行的函数
    * fn2:第二次点击时执行的函数
    
    
#### 自定义校对规则的实现
1. 格式:
    * name：校对规则的名称
    * fn: 校对规则代码的实现
    * message: 校对规则失败的提示信息
    * $.validator.addMethod(name,fn,message);
    