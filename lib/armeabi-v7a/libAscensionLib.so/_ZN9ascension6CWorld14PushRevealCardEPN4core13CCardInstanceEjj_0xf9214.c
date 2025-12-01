// 函数: _ZN9ascension6CWorld14PushRevealCardEPN4core13CCardInstanceEjj
// 地址: 0xf9214
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
uint32_t r0 = zx.d(*(arg1 + 0xa14))

if (r0 == 0)
    uint32_t* r1 = *(arg1 + 0xbe8)
    int32_t r3 = *(arg1 + 0xbec)
    int32_t entry_r3
    
    if (r1 != r3)
        *r1 = arg2
        r1[1] = arg3
        r1[2] = entry_r3
        int32_t r0_2 = *(arg1 + 0xbe8) + 0xc
        *(arg1 + 0xbe8) = r0_2
        return r0_2
    
    void* r8_1 = *(arg1 + 0xbe4)
    int32_t r10_1 = 0x15555555
    void* r2 = r1 - r8_1
    int32_t r9_1 = (r2 s>> 2) * 0xaaaaaaab
    int32_t r1_2 = r9_1 + 1
    
    if (r1_2 u> 0x15555555)
        return ascension::CWorld::PopRevealCard(
            std::__ndk1::__vector_base_common<true>::__throw_length_error()) __tailcall
    
    int32_t r0_6 = ((r3 - r8_1) s>> 2) * 0xaaaaaaab
    
    if (r0_6 u<= 0xaaaaaa9)
        if (r1_2 u<= r0_6 << 1)
            r1_2 = r0_6 << 1
        
        r10_1 = r1_2
    
    if (r0_6 u<= 0xaaaaaa9 && r1_2 == 0)
        r10_1 = 0
        r0 = 0
    else
        r0 = operator new(r10_1 * 0xc)
    
    int32_t r1_3 = (r2 * 0xd5555555) s>> 0x20
    int32_t r3_2 = r0 + r9_1 * 0xc
    *r3_2 = arg2
    *(r3_2 + 4) = arg3
    *(r3_2 + 8) = entry_r3
    int32_t r5_2 = r3_2 + ((r1_3 s>> 1) + (r1_3 u>> 0x1f)) * 0xc
    int32_t r7_3 = r0 + r10_1 * 0xc
    
    if (r2 s>= 1)
        r0 = __aeabi_memcpy4(r5_2, r8_1)
    
    *(arg1 + 0xbe4) = r5_2
    *(arg1 + 0xbe8) = r3_2 + 0xc
    *(arg1 + 0xbec) = r7_3
    
    if (r8_1 != 0)
        return operator delete(r8_1) __tailcall

return r0
