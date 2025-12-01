// 函数: _ZN14ascensionrules41CStateProcessDefeatAllMonstersInCenterRow16FindClonePointerEPv
// 地址: 0x15fb5c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r3 = *(arg1 + 0x28)

if (r3 != 0)
    int32_t entry_r1
    
    if (r3 + 0x4d4 == entry_r1)
        return arg1 + 0 + 0x4d4
    
    if (r3 + 0x558 == entry_r1)
        return arg1 + 0x84 + 0x4d4
    
    if (r3 + 0x5dc == entry_r1)
        return arg1 + 2 * 0x84 + 0x4d4
    
    if (r3 + 0x660 == entry_r1)
        return arg1 + 3 * 0x84 + 0x4d4
    
    if (r3 + 0x6e4 == entry_r1)
        return arg1 + 4 * 0x84 + 0x4d4
    
    if (r3 + 0x768 == entry_r1)
        return arg1 + 5 * 0x84 + 0x4d4
    
    if (r3 + 0x7ec == entry_r1)
        return arg1 + 6 * 0x84 + 0x4d4

int32_t* r0 = *(arg1 + 4)

if (r0 == 0)
    return 0

jump(*(*r0 + 0x2c))
