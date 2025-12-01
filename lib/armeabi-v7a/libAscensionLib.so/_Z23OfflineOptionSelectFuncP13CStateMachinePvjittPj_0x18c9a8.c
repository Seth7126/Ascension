// 函数: _Z23OfflineOptionSelectFuncP13CStateMachinePvjittPj
// 地址: 0x18c9a8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

uint32_t r4 = *s_pWorldData

if (*(r4 + 0xf8) != 3)
    int32_t r1 = *(r4 + 0x11c)
    int32_t r10_1 = *(r4 + 0x10c)
    uint32_t* r7_1 = arg7
    int32_t r0_1 = r1
    uint16_t r12_1 = arg6
    
    if (r1 == 0)
        r0_1 = 0x100
    
    uint16_t r5_1 = arg5
    int32_t r8_1 = 0x800 - (r0_1 << 4)
    int32_t r9_1 = r0_1 - 0x80
    int32_t r0_2 = r10_1 + 1
    
    do
        r9_1 += 0x80
        r8_1 -= 0x800
    while (r0_2 s>= r9_1)
    
    int32_t r6_1
    
    if (r1 == r9_1)
        r6_1 = *(r4 + 0x120)
    
    if (r1 != r9_1 || r6_1 == 0)
        uint32_t r0_3
        int32_t r1_1
        r1_1:r0_3 = mulu.dp.d(r9_1, 0x10)
        
        if (r1_1 != 0)
            r1_1 = 1
        
        if (r1_1 != 0)
            r0_3 = 0xffffffff
        
        int32_t r0_4 = operator new[](r0_3)
        void* r7_2 = *(r4 + 0x120)
        r6_1 = r0_4
        
        if (r7_2 == 0)
            __aeabi_memclr4(r6_1, 0 - r8_1)
        else
            __aeabi_memcpy4(r6_1, r7_2, r10_1 << 4)
            __aeabi_memclr4(r6_1 + (r10_1 << 4), 0 - (r10_1 << 4) - r8_1)
            operator delete[](r7_2)
        
        r10_1 = *(r4 + 0x10c)
        r12_1 = arg6
        r7_1 = arg7
        r0_2 = r10_1 + 1
        r5_1 = arg5
        *(r4 + 0x11c) = r9_1
        *(r4 + 0x120) = r6_1
    
    *(r4 + 0x10c) = r0_2
    uint32_t* r1_7 = r6_1 + (r10_1 << 4)
    *r1_7 = arg3
    r1_7[1].w = arg4.w
    *(r1_7 + 6) = r5_1
    r1_7[2].w = r12_1
    uint32_t r1_8
    
    if (r7_1 != 0)
        r1_8 = *r7_1
    else
        r1_8 = 0
    
    *(r6_1 + (r10_1 << 4) + 0xc) = r1_8
    *(r4 + 0x118) = r0_2
    SaveGameData()

return 1
