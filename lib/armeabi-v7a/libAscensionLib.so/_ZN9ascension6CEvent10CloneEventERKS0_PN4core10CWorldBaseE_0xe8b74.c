// 函数: _ZN9ascension6CEvent10CloneEventERKS0_PN4core10CWorldBaseE
// 地址: 0xe8b74
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

*(arg1 + 8) = *(arg2 + 8)
uint32_t entry_r2

if (zx.d(*(arg2 + 8)) != 0)
    int32_t i = 0
    
    do
        *(*(arg2 + 0xc + (i << 2)) + 8)
        *(arg1 + 0xc + (i << 2)) = core::CWorldBase::GetInstanceByID(entry_r2)
        i += 1
    while (i u< zx.d(*(arg2 + 8)))

*(arg1 + 0xa) = *(arg2 + 0xa)
uint32_t result = zx.d(*(arg2 + 0xa))

if (result != 0)
    int32_t r6_2 = 0
    
    do
        *(*(arg2 + 0x2c + (r6_2 << 2)) + 8)
        *(arg1 + 0x2c + (r6_2 << 2)) = core::CWorldBase::GetInstanceByID(entry_r2)
        r6_2 += 1
        result = zx.d(*(arg2 + 0xa))
    while (r6_2 u< result)

return result
