// 函数: _ZN14ascensionrules36CStateBanishAllAdjacentFromCenterRow16FindClonePointerEPv
// 地址: 0x13a23c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r2_3 = *(arg1 + 0x28)

if (r2_3 != 0)
    int32_t entry_r1
    
    if (r2_3 + 0x40 == entry_r1)
        return arg1 + 0 + 0x40
    
    if (r2_3 + 0xc4 == entry_r1)
        return arg1 + 0x84 + 0x40
    
    if (r2_3 + 0x148 == entry_r1)
        return arg1 + 2 * 0x84 + 0x40
    
    if (r2_3 + 0x1cc == entry_r1)
        return arg1 + 3 * 0x84 + 0x40
    
    if (r2_3 + 0x250 == entry_r1)
        return arg1 + 4 * 0x84 + 0x40
    
    if (r2_3 + 0x2d4 == entry_r1)
        return arg1 + 5 * 0x84 + 0x40
    
    if (r2_3 + 0x358 == entry_r1)
        return arg1 + 6 * 0x84 + 0x40

int32_t* r0 = *(arg1 + 4)

if (r0 == 0)
    return 0

jump(*(*r0 + 0x2c))
