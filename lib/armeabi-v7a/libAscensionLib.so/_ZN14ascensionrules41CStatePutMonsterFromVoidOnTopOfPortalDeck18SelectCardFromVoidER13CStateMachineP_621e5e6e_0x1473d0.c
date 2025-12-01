// 函数: _ZN14ascensionrules41CStatePutMonsterFromVoidOnTopOfPortalDeck18SelectCardFromVoidER13CStateMachineP6CStateiPj
// 地址: 0x1473d0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

core::CCardInstance* r5 = *(*(arg2 + 0x24c) + 4)
int32_t var_18 = 0
ascension::CWorld::OutputAnimationCard(r5, arg3, 5, 9, 0, 8, 0, 0)
ascension::CWorld::RemoveCardFromVoid(r5)
return ascension::CWorld::PutCardOnTopOfPortalDeck(r5) __tailcall
