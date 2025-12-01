// 函数: _ZN9ascension9CDatabase7GetCardEP9lua_State
// 地址: 0xe5b44
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

char* __s2 = lua_tolstring(arg1, 1, 0)
int32_t* r7 = *ascension::g_Database
int32_t r4 = *(ascension::g_Database + 4)
void* r6_1

if (r7 != r4)
    do
        r6_1 = *r7
        
        if (strcasecmp(r6_1 + 4, __s2) == 0)
            goto label_e5ba8
        
        r7 = &r7[1]
    while (r4 != r7)

r6_1 = nullptr
label_e5ba8:
lua_pushlightuserdata(arg1, r6_1)
return 1
