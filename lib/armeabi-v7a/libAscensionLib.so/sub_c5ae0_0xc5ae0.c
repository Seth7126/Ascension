// 函数: sub_c5ae0
// 地址: 0xc5ae0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr

switch (arg2)
    case 0, 1, 2, 3, 4, 5
        if (*arg3 == 5 && arg3[4] == 0xffffffff)
            int32_t result = arg3[5]
            
            if (result == 0xffffffff)
                return result
    case 6
        sub_c471c(arg1, arg3)
        
        if (*arg3 == 6)
            int32_t r0_6 = arg3[2]
            
            if ((r0_6 & 0x100) == 0 && r0_6 s>= zx.d(*(arg1 + 0x2e)))
                arg1[0xc].b -= 1
        
        void* r1_4 = *arg1
        uint32_t r2_1 = zx.d(arg1[0xc].b)
        
        if (r2_1 u>= zx.d(*(r1_4 + 0x4e)))
            if (r2_1 u>= 0xf9)
                int32_t* r0_17
                int32_t r1_12
                int32_t* r2_6
                int32_t* r3_5
                r0_17, r1_12, r2_6, r3_5 =
                    sub_ce78c(arg1[3], "function or expression too complex", arg5)
                
                if (r2_1 == 0xf9)
                    *arg5 = arg4
                
                return sub_c5c20(r0_17, r1_12, r2_6, r3_5) __tailcall
            
            *(r1_4 + 0x4e) = r2_1.b + 1
        
        arg1[0xc].b = r2_1.b + 1
        return sub_c48c0(arg1, arg3, 0xffffffff + zx.d(r2_1.b + 1), arg5) __tailcall
    case 0xd
        return sub_c5104(arg1, arg3) __tailcall
    case 0xe
        return sub_c53f4(arg1, arg3) __tailcall

return sub_c4d64(arg1, arg3) __tailcall
