// 函数: _Z17RetrieveMoveEntryPvjRiRjS1_S1_
// 地址: 0x18c534
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

uint32_t r2 = *s_pWorldData
int32_t r0 = *(r2 + 0x1fc)
int32_t result

if (r0 == 0)
    result = 0
    int32_t* r0_4 = r2 + (*(s_InterfaceContext + 0x10) << 2) + 0xfc
    int32_t r3 = *r0_4
    
    if (r3 u< *(r2 + 0x10c) && r3 u< *(r2 + 0x114))
        int32_t r2_3 = *(r2 + 0x120)
        
        if (*(r2_3 + (r3 << 4)) != arg2)
            *arg3 = 0xffffffff
            *arg4 = 0
            *arg5 = 0
            *arg6 = 0
        else
            void* r1_5 = r2_3 + (r3 << 4)
            *arg3 = sx.d(*(r1_5 + 4))
            *arg4 = zx.d(*(r1_5 + 6))
            *arg5 = zx.d(*(r1_5 + 8))
            *arg6 = *(r1_5 + 0xc)
            *r0_4 += 1
        
        return 1
else
    result = 1
    data_1f4e48 = 1
    CommitTemporaryMoveBuffer(r0)
    data_1f4e48 = 1
    int32_t* r0_1 = data_1f5894
    
    if (r0_1 != 0 && &r0_1[3] u< data_1f5898 + data_1f589c)
        r0_1[1] = 0x24
        *r0_1 = 0xc
        data_1f5894 = &r0_1[3]
        uint32_t r7_1 = *s_pWorldData
        data_1f5890 += 1
        r0_1[2] = *(r7_1 + 0x1fc)
    
    *arg3 = 0xffffffff
    *arg4 = 0
    *arg5 = 0
    *arg6 = 0

return result
