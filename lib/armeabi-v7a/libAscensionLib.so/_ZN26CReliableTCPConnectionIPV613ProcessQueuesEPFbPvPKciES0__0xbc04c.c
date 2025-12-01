// 函数: _ZN26CReliableTCPConnectionIPV613ProcessQueuesEPFbPvPKciES0_
// 地址: 0xbc04c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
int32_t var_134 = 0
int32_t __timeout = 0
socklen_t var_13c
int32_t var_130[0x20]
int32_t var_b0[0x21]

if (zx.d(*(arg1 + 0x19)) != 0)
    __aeabi_memclr8(&var_b0, 0x80)
    int32_t r0_3 = *(arg1 + 4)
    uint32_t r1 = r0_3 u>> 5
    var_b0[r1] |= 1 << (zx.d(r0_3.b) & 0x1f)
    
    if (select(r0_3 + 1, nullptr, &var_b0, nullptr, &__timeout) s>= 1)
        int32_t __fd = *(arg1 + 4)
        *(arg1 + 0x19) = 0
        
        if ((var_b0[__fd u>> 5] & 1 << (zx.d(__fd.b) & 0x1f)) != 0)
            var_13c = 4
            int32_t r0_6 = getsockopt(__fd, 1, 4, &var_130, &var_13c)
            
            if ((var_130[0] | r0_6) == 0)
                (**arg1)(arg1)
                *(arg1 + 0x18) = 1
else if (zx.d(*(arg1 + 0x18)) != 0)
    int32_t r2
    int32_t var_144_1 = r2
    __aeabi_memclr8(&var_b0, 0x80)
    int32_t r9_1 = *(arg1 + 4)
    char r8_1 = r9_1.b & 0x1f
    uint32_t r10_1 = r9_1 u>> 5
    var_b0[r10_1] |= 1 << zx.d(r8_1)
    __aeabi_memclr8(&var_130, 0x80)
    var_130[r10_1] |= 1 << zx.d(r8_1)
    
    if (select(r9_1 + 1, &var_b0, nullptr, &var_130, &__timeout) s< 1)
        CReliableTCPConnectionIPV6::ProcessMessageBuffer(arg1, arg2)
    else
        int32_t __fd_1 = *(arg1 + 4)
        int32_t r2_5 = __fd_1 & 0x1f
        uint32_t r1_6 = __fd_1 u>> 5
        
        if ((var_130[r1_6] & 1 << (r2_5 & 0xff)) == 0)
            if ((var_b0[r1_6] & 1 << r2_5) != 0)
                CReliableTCPConnectionIPV6::FillMessageBuffer()
                undefined
            
            CReliableTCPConnectionIPV6::ProcessMessageBuffer(arg1, arg2)
        else
            socklen_t __optlen = 4
            
            if (getsockopt(__fd_1, 1, 4, &var_13c, &__optlen) == 0)
                puts("#### Network Exception error!")
                printf("        error = %d\n", var_13c)
            
            (*(*arg1 + 4))(arg1)
int32_t r0_25 = *__stack_chk_guard

if (r0_25 == r0)
    return r0_25 - r0

__stack_chk_fail()
noreturn
