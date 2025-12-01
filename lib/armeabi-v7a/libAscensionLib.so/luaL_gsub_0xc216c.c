// 函数: luaL_gsub
// 地址: 0xc216c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

char* s_1 = arg4
void* s = arg2
int32_t r0 = *__stack_chk_guard
uint32_t r0_2 = strlen(arg3)
void var_42c
void* var_43c = &var_42c
void* var_440 = &var_42c
int32_t r6 = 0
int32_t r5 = 0x400
int32_t var_434 = 0
int32_t var_438 = 0x400
char* i_2 = strstr(s, arg3)
int32_t r4_1

if (i_2 == 0)
    r4_1 = arg1
else
    char* i_1 = i_2
    r5 = 0x400
    r6 = 0
    r4_1 = arg1
    char* s_2 = s_1
    char* i
    
    do
        int32_t r10_1 = i_1 - s
        void* r5_1
        
        if (r5 - r6 u>= r10_1)
            r5_1 = var_43c
        else
            int32_t r9 = r5 << 1
            
            if ((r5 << 1) - r6 u< r10_1)
                r9 = r6 + r10_1
            
            if (r9 u< r6 || r9 - r6 u< r10_1)
                luaL_error(r4_1, "buffer too large")
            
            void* r0_9 = lua_newuserdata(r4_1, r9)
            r5_1 = r0_9
            __aeabi_memcpy(r0_9, var_43c, var_434)
            
            if (var_43c != var_440)
                lua_remove(r4_1, 0xfffffffe)
            
            r6 = var_434
            var_438 = r9
            s_1 = s_2
            var_43c = r5_1
        
        __aeabi_memcpy(r5_1 + r6, s, r10_1)
        int32_t r4_2 = var_434 + r10_1
        int32_t var_434_1 = r4_2
        uint32_t r0_15 = strlen(s_1)
        void* r5_2
        
        if (var_438 - r4_2 u>= r0_15)
            r5_2 = var_43c
        else
            int32_t r6_1 = var_438 << 1
            
            if ((var_438 << 1) - r4_2 u< r0_15)
                r6_1 = r0_15 + r4_2
            
            if (r6_1 u< r4_2 || r6_1 - r4_2 u< r0_15)
                luaL_error(arg1, "buffer too large")
            
            void* r0_20 = lua_newuserdata(arg1, r6_1)
            r5_2 = r0_20
            __aeabi_memcpy(r0_20, var_43c, var_434_1)
            
            if (var_43c != var_440)
                lua_remove(arg1, 0xfffffffe)
            
            r4_2 = var_434_1
            s_1 = s_2
            var_438 = r6_1
            var_43c = r5_2
        
        __aeabi_memcpy(r5_2 + r4_2, s_1, r0_15)
        r6 = var_434_1 + r0_15
        var_434 = r6
        s = &i_1[r0_2]
        i = strstr(s, arg3)
        r5 = var_438
        i_1 = i
        r4_1 = arg1
    while (i != 0)

uint32_t r0_28 = strlen(s)
void* r5_3

if (r5 - r6 u>= r0_28)
    r5_3 = var_43c
else
    int32_t r9_3 = r5 << 1
    
    if ((r5 << 1) - r6 u< r0_28)
        r9_3 = r6 + r0_28
    
    if (r9_3 u< r6 || r9_3 - r6 u< r0_28)
        luaL_error(r4_1, "buffer too large")
    
    void* r0_33 = lua_newuserdata(r4_1, r9_3)
    r5_3 = r0_33
    __aeabi_memcpy(r0_33, var_43c, var_434)
    
    if (var_43c != var_440)
        lua_remove(r4_1, 0xfffffffe)
    
    r6 = var_434
    int32_t var_438_1 = r9_3
    var_43c = r5_3

__aeabi_memcpy(r5_3 + r6, s, r0_28)
int32_t var_434_2 = var_434 + r0_28
lua_pushlstring(arg1, var_43c)

if (var_43c != var_440)
    lua_remove(arg1, 0xfffffffe)

int32_t result = lua_tolstring(arg1, 0xffffffff, 0)

if (*__stack_chk_guard == r0)
    return result

__stack_chk_fail()
noreturn
