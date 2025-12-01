// 函数: _Z10SubmitMovePK9MoveEntry
// 地址: 0x19148c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

uint32_t r6 = *s_pWorldData
int32_t r0 = *__stack_chk_guard
int32_t r4 = *(s_InterfaceContext + 0x10)
int32_t r1 = *(r6 + 0xd4)
int32_t r8
int32_t r9

if (r1 s< 1)
    r8 = 0
    r9 = 0
else
    int32_t* r2_1 = r6 + 0x14
    int32_t r0_1 = 0
    
    while (true)
        if (*arg1 == *r2_1)
            if (*(r6 + 0xf8) != 3)
                *(r6 + 0xd8) &= (not.d(1 << (r0_1 & 0xff))).b
            
            void* r0_2 = r6 + r4 * 0x34 + (r0_1 << 2)
            r9 = *(r0_2 + 0x138)
            r8 = *(r0_2 + 0x148)
            *(r0_2 + 0x138) = 0
            *(r0_2 + 0x148) = 0
            break
        
        r0_1 += 1
        r2_1 = &r2_1[0xc]
        
        if (r0_1 s>= r1)
            r8 = 0
            r9 = 0
            break

uint32_t r0_3 = *(s_InterfaceContext + 8)

if (r0_3 != 0)
    *arg1
    GameOptionManager::ResetPlayerOptionEntry(r0_3)

if (r9 != 0)
    int32_t* r1_6 = *(arg1 + 0xc)
    int32_t* var_2c = r1_6
    int32_t* r7_2 = &var_2c
    
    if (r1_6 == 0)
        r7_2 = r1_6
    
    r9(*(r6 + r4 * 0x34 + 0x130), r8, *arg1, sx.d(*(arg1 + 4)), zx.d(*(arg1 + 6)), 
        zx.d(*(arg1 + 8)), r7_2)

if (zx.d(*(*s_InterfaceContext + 0x10)) == 0)
    int32_t* r0_10 = data_1f5894
    
    if (r0_10 != 0 && &r0_10[5] u< data_1f5898 + data_1f589c)
        r0_10[1] = 0x15
        *r0_10 = 0x14
        data_1f5894 = &r0_10[5]
        data_1f5890 += 1
        r0_10[2] = *arg1
        r0_10[3].w = *(arg1 + 8)
        *(r0_10 + 0xe) = *(arg1 + 6)
        r0_10[4] = *(arg1 + 0xc)

int32_t r0_8 = *__stack_chk_guard

if (r0_8 == r0)
    return r0_8 - r0

__stack_chk_fail()
noreturn
