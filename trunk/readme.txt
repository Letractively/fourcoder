hello
four coders
now, go


规范：

1. 尽可能使用开源的包，嘿嘿

2.model层只包括基础的do

3.DAO层只操作数据库

4.Manager层封装DAO的操作，返回封装的结果ResultDO给service层，让服务层专注服务的内容，又不直接操作DAO层

5.service层负责一些服务，封装Manager的使用等

6.调整格式尽量使用tab而不是空格