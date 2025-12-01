// 函数: atan2l
// 地址: 0x1a57b0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
int32_t r4 = arg4 & 0x7fffffff
int128_t q0
q0:8.q = arg4:arg3
q0.q = arg2:arg1
int32_t r12_1

if ((r4 | ((0 - arg3) | arg3) u>> 0x1f) u<= 0x7ff00000)
    r12_1 = arg2 & 0x7fffffff

if ((r4 | ((0 - arg3) | arg3) u>> 0x1f) u<= 0x7ff00000
        && (r12_1 | ((0 - arg1) | arg1) u>> 0x1f) u<= 0x7ff00000)
    if (arg3 == 0 && arg4 == 0x3ff00000)
        return atanl(arg1, arg2) __tailcall
    
    uint32_t r8_1 = (2 & arg4 u>> 0x1e) | arg2 u>> 0x1f
    
    if ((arg1 | r12_1) == 0)
        if (r8_1 == 3)
        label_1a58b0:
            q0.q = 0x54442d18
            q0:8.q = data_1e40c0
            q0.q = q0.q f- q0:8.q
        else if (r8_1 == 2)
        label_1a585c:
            q0.q = 0x54442d18
            q0:8.q = data_1e40c0
            q0.q = q0:8.q f+ q0.q
    else
        int128_t q1
        
        if ((r4 | arg3) == 0)
        label_1a5874:
            q0.q = 0x54442d18
            q1.q = 0x21fb5444
            q0:8.q = data_1e40c0
            q1:8.q = 6.984873502635735e-315 f- q0:8.q
            q0.q = q0:8.q f+ 2.8167632854085806e-315
            
            if (arg2 s< 0)
                q0.q = q1:8.q
        else if (r4 != 0x7ff00000)
            if (r12_1 == 0x7ff00000)
                goto label_1a5874
            
            int32_t r0_4 = r12_1 - r4
            
            if (r0_4 s< 0x3d00000)
                bool cond:3_1 = arg4 s< 0xffffffff
                
                if (arg4 s<= 0xffffffff)
                    cond:3_1 = r0_4 s< 0xfc400000
                
                if (cond:3_1)
                    q0.q = 0
                else
                    q0.q = q0.q f/ q0:8.q
                    q0.q = fabs(q0.q)
                    int32_t r0_5
                    int32_t r1_2
                    r1_2:r0_5 = q0.q
                    int32_t r0_6
                    int32_t r1_3
                    r0_6, r1_3, q0 = atanl(r0_5, r1_2)
                    q0.q = r1_3:r0_6
            else
                q0:8.q = 0x3f00000000000000
                r8_1 = arg2 u>> 0x1f
                q1.q = data_1e40c8
                q0.q = 0x21fb5444
                unimplemented  {vmla.f64.F64 d0, d2, d1}
            
            if (r8_1 != 0)
                if (r8_1 == 2)
                    q0:8.q = data_1e40c8
                    q0.q = q0:8.q f- q0.q
                    q0:8.q = 0x21fb5444
                    q0.q = q0.q f+ q0:8.q
                else if (r8_1 != 1)
                    q0:8.q = data_1e40c8
                    q0.q = q0.q f- q0:8.q
                    q0:8.q = 0x54442d18
                    q0.q = q0.q f+ q0:8.q
                else
                    q0.q = fneg(q0.q)
        else if (r12_1 != 0x7ff00000)
            if (r8_1 == 3)
                goto label_1a58b0
            
            if (r8_1 == 2)
                goto label_1a585c
            
            if (r8_1 == 1)
                q0.q = 0
            else
                q0.q = 0
        else if (r8_1 == 1)
            q0.q = 0x54442d18
            q0:8.q = data_1e40c0
            q0.q = q0.q f- q0:8.q
        else if (r8_1 == 2)
            q0.q = 0xd97c7f33
            q0:8.q = data_1e40c0
            q0.q = q0:8.q f+ q0.q
        else if (r8_1 != 3)
            q0.q = 0x21fb5444
            q0:8.q = data_1e40c0
            q0.q = q0:8.q f+ q0.q
        else
            q0.q = 0x7f3321d2
            q0:8.q = data_1e40c0
            q0.q = q0.q f- q0:8.q
else
    q0:8.q = q0:8.q f+ 0.0
    q0.q = q0.q f+ 0.0
    q0.q = q0.q f+ q0:8.q

int32_t result
int32_t r1
r1:result = q0.q
return result
