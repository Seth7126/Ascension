// 函数: _ZN14ascensionrules40CStateProcessBanishMultipleFromCenterRow16FindClonePointerEPv
// 地址: 0x1399e0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r2_3 = *(arg1 + 0x28)

if (r2_3 != 0)
    int32_t entry_r1
    
    if (r2_3 + 0x280 == entry_r1)
        return arg1 + 0 + 0x280
    
    if (r2_3 + 0x304 == entry_r1)
        return arg1 + 0x84 + 0x280
    
    if (r2_3 + 0x388 == entry_r1)
        return arg1 + 2 * 0x84 + 0x280
    
    if (r2_3 + 0x40c == entry_r1)
        return arg1 + 3 * 0x84 + 0x280
    
    if (r2_3 + 0x490 == entry_r1)
        return arg1 + 4 * 0x84 + 0x280
    
    if (r2_3 + 0x514 == entry_r1)
        return arg1 + 5 * 0x84 + 0x280
    
    if (r2_3 + 0x598 == entry_r1)
        return arg1 + 6 * 0x84 + 0x280

int32_t* r0 = *(arg1 + 4)

if (r0 == 0)
    return 0

jump(*(*r0 + 0x2c))
