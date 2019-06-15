# KotlinDataBindingSample2
## mark
### ViewModel
- @Bindableをつけることにより、監視用の定数BR.<name>が生成されます。
- 呼び出し側へnotifyPropertyChanged(BR.<name>)を追加し、BR.<name>に対応するget()が呼ばれるようにします。
### View
- 双方向では@={vm.name}のように@の後ろに=をつけます。

## sceenshot
<img src="https://user-images.githubusercontent.com/6063541/59554907-69fd4700-8fe5-11e9-90d5-5f231012ad27.jpg" width="300">
