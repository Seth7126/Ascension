// 函数: sub_dc214
// 地址: 0xdc214
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (arg3 s<= arg2)
    return 

int32_t r8_1 = arg3
int32_t r5_1 = arg2

do
    lua_rawgeti(arg1, 1, r5_1)
    lua_rawgeti(arg1, 1, r8_1)
    
    if (sub_dc5c0(arg1, 0xffffffff, 0xfffffffe) == 0)
        lua_settop(arg1, 0xfffffffd)
    else
        lua_rawseti(arg1, 1, r5_1)
        lua_rawseti(arg1, 1, r8_1)
    
    int32_t r7_1 = r8_1 - r5_1
    
    if (r7_1 == 1)
        break
    
    int32_t r0_7 = r8_1 + r5_1
    int32_t r4_1 = (r0_7 + (r0_7 u>> 0x1f)) s>> 1
    lua_rawgeti(arg1, 1, r4_1)
    lua_rawgeti(arg1, 1, r5_1)
    int32_t r0_14
    int32_t r2_7
    
    if (sub_dc5c0(arg1, 0xfffffffe, 0xffffffff) == 0)
        lua_settop(arg1, 0xfffffffe)
        lua_rawgeti(arg1, 1, r8_1)
        
        if (sub_dc5c0(arg1, 0xffffffff, 0xfffffffe) != 0)
            lua_rawseti(arg1, 1, r4_1)
            r0_14 = arg1
            r2_7 = r8_1
            goto label_dc35c
        
        lua_settop(arg1, 0xfffffffd)
        
        if (r7_1 == 2)
            break
    else
        lua_rawseti(arg1, 1, r4_1)
        r0_14 = arg1
        r2_7 = r5_1
    label_dc35c:
        lua_rawseti(r0_14, 1, r2_7)
        
        if (r7_1 == 2)
            break
    lua_rawgeti(arg1, 1, r4_1)
    lua_pushvalue(arg1, 0xffffffff)
    int32_t r7_2 = r8_1 - 1
    lua_rawgeti(arg1, 1, r7_2)
    lua_rawseti(arg1, 1, r4_1)
    lua_rawseti(arg1, 1, r7_2)
    int32_t r10_1 = r5_1
    int32_t var_2c_1 = r7_2
    int32_t var_28_1
    
    while (true)
        var_28_1 = r10_1 + 1
        lua_rawgeti(arg1, 1, r10_1 + 1)
        
        if (sub_dc5c0(arg1, 0xffffffff, 0xfffffffe) != 0)
            int32_t r4_2
            bool cond:1_1
            
            do
                r4_2 = r10_1 + 1
                
                if (r8_1 s<= r4_2)
                    luaL_error(arg1, "invalid order function for sorting")
                
                lua_settop(arg1, 0xfffffffe)
                lua_rawgeti(arg1, 1, r10_1 + 2)
                cond:1_1 = sub_dc5c0(arg1, 0xffffffff, 0xfffffffe) != 0
                r10_1 = r4_2
            while (cond:1_1)
            r10_1 = r4_2
            var_28_1 = r4_2 + 1
        
        int32_t r9_1 = r7_2 - 1
        lua_rawgeti(arg1, 1, r9_1)
        
        if (sub_dc5c0(arg1, 0xfffffffd, 0xffffffff) != 0)
            int32_t r4_3
            bool cond:3_1
            
            do
                r4_3 = r7_2 - 1
                
                if (r4_3 s<= r5_1)
                    luaL_error(arg1, "invalid order function for sorting")
                
                lua_settop(arg1, 0xfffffffe)
                lua_rawgeti(arg1, 1, r7_2 - 2)
                cond:3_1 = sub_dc5c0(arg1, 0xfffffffd, 0xffffffff) != 0
                r7_2 = r4_3
            while (cond:3_1)
            r9_1 = r4_3 - 1
            r7_2 = r4_3
        
        if (r7_2 s<= var_28_1)
            break
        
        lua_rawseti(arg1, 1, var_28_1)
        lua_rawseti(arg1, 1, r9_1)
        r10_1 = var_28_1
        r7_2 = r9_1
    
    lua_settop(arg1, 0xfffffffc)
    lua_rawgeti(arg1, 1, var_2c_1)
    lua_rawgeti(arg1, 1, var_28_1)
    lua_rawseti(arg1, 1, var_2c_1)
    lua_rawseti(arg1, 1, var_28_1)
    int32_t r9_2 = r8_1 - var_28_1
    int32_t r7_4 = var_28_1 - r5_1
    int32_t r2_24 = r8_1
    int32_t r1 = r10_1 + 2
    
    if (r7_4 s< r9_2)
        r2_24 = r10_1
        r1 = r5_1
    
    sub_dc214(arg1, r1, r2_24)
    
    if (r7_4 s>= r9_2)
        r8_1 = r10_1
    else
        r5_1 = r10_1 + 2
while (r8_1 s> r5_1)
