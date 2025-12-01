// 函数: _ZN14ascensionrules31CStatePlayPhantasmFromCenterRow9ExitStateER13CStateMachine
// 地址: 0x16a674
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

*(arg1 + 0x38)
core::CCardInstance* r6 = *(*(arg1 + 0x30) + 4)
ascension::CWorld::PutCardInVoid(r6)
int32_t var_20 = 0
ascension::CWorld::OutputAnimationCard(r6, *(arg1 + 0x38), 0xd, 0xb, 0, 9, 0, &__elf_header)
*(arg1 + 0x38)
ascension::CWorld::PopResolveEffect(r6)
return CState::ExitState(arg1) __tailcall
