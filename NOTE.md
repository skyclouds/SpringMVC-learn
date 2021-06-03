## MVC
- Model:模型(Dao,Service)
- View:视图(jsp/html)
- Controller:控制器:(Servlet,转发或者重定向)

pojo又细分vo(视图对象)、dto(数据传输对象),之所以细分例如pojo对象User(用户名、密码、爱好、性别、...)对于登录页面只需要用户名与密码所以细分一个vo(只包含实际需要用到的用户名和密码),dto对象的细分依据类似

## web目录
- 公共页面放在web目录下面
- 为了保证安全放在WEB-INF目录下面
