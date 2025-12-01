// 函数: _ZN4core10CWorldBase15ProcessRollbackEPv
// 地址: 0xb7e94
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t entry_r1
void** i

for (i = *(arg1 + 0xa24); i != entry_r1; i = *i)
    int32_t r0 = i[1]
    void* r0_1
    int32_t r2_1
    
    if (r0 == 0)
        r2_1 = *(*arg1 + 0x14)
        r0_1 = arg1
    else
        r0_1 = *(*(arg1 + 0xc) + (r0 << 2))
        r2_1 = *(*r0_1 + 0x10)
    
    r2_1(r0_1, i)
    *(arg1 + 0xa20) = i

*(arg1 + 0xa24) = i
