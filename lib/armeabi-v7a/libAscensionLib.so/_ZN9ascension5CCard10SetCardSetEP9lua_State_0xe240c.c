// 函数: _ZN9ascension5CCard10SetCardSetEP9lua_State
// 地址: 0xe240c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r0 = lua_touserdata(arg1, 1)
int32_t r7 = 0
char* __s2 = lua_tolstring(arg1, 2, 0)

if (strcasecmp("none", __s2) == 0)
    r7 = 0xffffffff
else if (strcasecmp("cotg", __s2) != 0)
    if (strcasecmp("rotf", __s2) == 0)
        r7 = 1
    else if (strcasecmp("sos", __s2) == 0)
        r7 = 2
    else if (strcasecmp("ih", __s2) == 0)
        r7 = 3
    else if (strcasecmp("rov", __s2) == 0)
        r7 = 4
    else if (strcasecmp("du", __s2) == 0)
        r7 = 5
    else if (strcasecmp("ru", __s2) == 0)
        r7 = 6
    else if (strcasecmp("doc", __s2) == 0)
        r7 = 7
    else if (strcasecmp("ds", __s2) == 0)
        r7 = 8
    else if (strcasecmp("wos", __s2) == 0)
        r7 = 9
    else if (strcasecmp("gote", __s2) == 0)
        r7 = 0xa
    else if (strcasecmp("vota", __s2) == 0)
        r7 = 0xb
    else if (strcasecmp("del", __s2) == 0)
        r7 = 0xc
    else if (strcasecmp("dlvr", __s2) == 0)
        r7 = 0xd
    else if (strcasecmp("cotg10", __s2) == 0)
        r7 = 0xe
    else
        r7 = 0xffffffff
        
        if (strcasecmp("promo", __s2) == 0)
            r7 = 0xf

*(r0 + 0x90) = r7
return 0
