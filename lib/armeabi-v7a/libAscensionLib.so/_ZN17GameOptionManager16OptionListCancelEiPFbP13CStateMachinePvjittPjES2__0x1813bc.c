// 函数: _ZN17GameOptionManager16OptionListCancelEiPFbP13CStateMachinePvjittPjES2_
// 地址: 0x1813bc
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

bool (** r12)(CStateMachine*, void*, uint32_t, int32_t, uint16_t, uint16_t, uint32_t*) =
    *(arg1 + 0x3f8)

if (r12 == 0)
    return 

*r12 = arg2
r12[1] = arg3
bool (* entry_r3)(CStateMachine*, void*, uint32_t, int32_t, uint16_t, uint16_t, uint32_t*)
r12[2] = entry_r3
r12[0x26] = 0

if (*(arg1 + 4) == arg2)
    *(arg1 + 0x3fc) = r12

*(arg1 + 0x3f8) = 0
