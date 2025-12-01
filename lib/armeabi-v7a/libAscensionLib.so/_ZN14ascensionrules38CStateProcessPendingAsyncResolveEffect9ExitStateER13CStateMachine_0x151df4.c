// 函数: _ZN14ascensionrules38CStateProcessPendingAsyncResolveEffect9ExitStateER13CStateMachine
// 地址: 0x151df4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r6 = *(*(arg1 + 0x30) + 4)

if (*(arg1 + 0x34) != 0)
    ascension::CWorld::OutputPauseBrief(r6)
    int32_t var_20_1 = 0
    ascension::CWorld::OutputAnimationCard(r6, *(arg1 + 0x34), 0xc, 0xb, 0, 9, 0, &__elf_header)
    *(arg1 + 0x34)
    ascension::CWorld::PopResolveEffect(r6)
else if (*(arg1 + 0x38) != 0)
    ascension::CWorld::OutputPauseBrief(r6)
    int32_t var_20_2 = 0
    ascension::CWorld::OutputAnimationCard(r6, *(arg1 + 0x38), 9, 0xb, 0, 7, *(arg1 + 0x3c), 0)
    *(arg1 + 0x38)
    ascension::CWorld::PopResolveEffect(r6)

return CState::ExitState(arg1) __tailcall
