// 函数: _ZN9ascension32CEventQueryCardAcquireAttributes16AcquireCardEntry18AddAcquireLocationEhhtb
// 地址: 0xe8c14
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r12_1 = *(arg1 + 0x1c)

if (r12_1 s> 7)
    return 

*(arg1 + r12_1 + 0x20) = arg2
*(arg1 + *(arg1 + 0x1c) + 0x28) = arg3.b
int32_t r1_2 = *(arg1 + 0x1c)
*(arg1 + (r1_2 << 1) + 0x30) = arg4.w
int32_t arg_0

if (arg_0 != 0 && *(arg1 + 0x40) == 0xffffffff)
    *(arg1 + 0x40) = r1_2

*(arg1 + 0x1c) = r1_2 + 1
