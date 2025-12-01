// 函数: _ZN14ascensionrules33CStateProcessChooseFactionForCard13SelectFactionER13CStateMachineP6CStateiPj
// 地址: 0x151370
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

core::CInstance* r4 = *(arg2 + 0x250)
uint32_t r5 = *(*(arg2 + 0x24c) + 4)
core::CInstance* r0_2 = ascension::CDatabase::GetActiveEffect(ascension::g_Database)
core::CWorldBase* r0_3 = operator new(0x150)
ascension::CActiveEffectDefinition* r2 = *(r5 + 4)
*(r5 + 4) = r2 + 1
core::CInstance* var_24 = r4
ascension::CActiveEffectInstance::CActiveEffectInstance(r0_3, r5, r2, r0_2, r4)
core::CWorldBase::AddInstance(r5)
ascension::CActiveEffectInstance::AddEffectDurationFunc(r0_3, "UntilEndOfTurn")
ascension::CWorld::AddActiveEffect(r5)
return ascension::CActiveEffectInstance::SetEffectData(r0_3, 0) __tailcall
