// 函数: sub_c3140
// 地址: 0xc3140
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r5
int32_t var_20 = r5
int32_t r4
int32_t var_24 = r4
unimplemented  {vpush {d8, d9, d10}}
int32_t r0 = *__stack_chk_guard

if (lua_type(arg1, 2) s<= 0)
    int32_t var_30
    int32_t r0_13 = lua_tonumberx(arg1, 1, &var_30)
    
    if (var_30 == 0)
        luaL_checkany(arg1, 1, r0_13)
        lua_pushnil(arg1)
    else
        lua_pushnumber(arg1)
else
    int32_t var_34
    char* s = luaL_checklstring(arg1, 1, &var_34)
    int32_t r9_1 = var_34
    int32_t r0_5 = luaL_checkinteger(arg1, 2)
    
    if (r0_5 - 2 u>= 0x23)
        luaL_argerror(arg1, 2, "base out of range")
    
    char* s_1 = &s[strspn(s, 0x1c0230)]
    uint32_t r0_10 = zx.d(*s_1)
    int32_t r0_11
    
    if (r0_10 == 0x2b)
        s_1 = &s_1[1]
        r0_11 = 0
    else if (r0_10 != 0x2d)
        r0_11 = 0
    else
        r0_11 = 1
        s_1 = &s_1[1]
    
    uint32_t r7_1 = zx.d(*s_1)
    
    if (isalnum(r7_1) == 0)
        lua_pushnil(arg1)
    else
        int128_t q0
        q0.d = r0_5
        int128_t q4
        q4:8.q = 0
        unimplemented  {vcvt.f64.s32 d8, s0}
        int32_t i
        
        do
            int32_t r0_20
            
            if (0xffffffd0 + (r7_1 & 0xff) u> 9)
                r0_20 = toupper(r7_1 & 0xff) - 0x37
                
                if (r0_20 s>= r0_5)
                    unimplemented  {vmov.f64 q5, #3.125000e+00}
                    break
            else
                r0_20 = (r7_1 << 0xfffffffc s>> 0x18) - 0x30
                
                if (r0_20 s>= r0_5)
                    unimplemented  {vmov.f64 q5, #3.125000e+00}
                    break
            
            q0.d = r0_20
            unimplemented  {vcvt.f64.s32 d10, s0}
            s_1 = &s_1[1]
            r7_1 = zx.d(*s_1)
            unimplemented  {vmla.f64 d10, d9, d8}
            i = isalnum(r7_1)
            unimplemented  {vmov.f64 q4, #3.250000e+00}
        while (i != 0)
        
        if (&s_1[strspn(s_1, 0x1c0230)] != &s[r9_1])
            lua_pushnil(arg1)
        else
            unimplemented  {vneg.f64 d0, d10}
            
            if (r0_11 == 0)
                unimplemented  {vmoveq.f64 q0, #3.250000e+00}
            
            unimplemented  {vmov r2, r3, d0}
            lua_pushnumber(arg1)

if (*__stack_chk_guard == r0)
    unimplemented  {vpopeq {d8, d9, d10}}
    jump(arg2)

__stack_chk_fail()
noreturn
